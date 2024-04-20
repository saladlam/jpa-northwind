package info.saladlam.example.jpa.northwind.service;

import info.saladlam.example.jpa.northwind.dto.NameValueDto;
import info.saladlam.example.jpa.northwind.dto.StringAndStringDto;
import info.saladlam.example.jpa.northwind.entity.Employee;
import info.saladlam.example.jpa.northwind.entity.OrderDetail;
import info.saladlam.example.jpa.northwind.entity.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BusinessAnalysisServiceImpl implements BusinessAnalysisService {

    @Autowired
    private EntityManager em;

    @Override
    public List<StringAndStringDto> listNameOfStaffAndSupervisor() {
        return em.createQuery(
                        "SELECT NEW info.saladlam.example.jpa.northwind.dto.StringAndStringDto(CONCAT(e.firstname, ' ', e.lastname), CONCAT(m.firstname, ' ', m.lastname))" +
                                " FROM Employee e LEFT JOIN e.manager m", StringAndStringDto.class)
                .getResultList();
    }

    @Override
    public List<NameValueDto> totalSalesByCategoryBetweenDate(LocalDateTime from, LocalDateTime to) {
        return em.createQuery(
                        "SELECT NEW info.saladlam.example.jpa.northwind.dto.NameValueDto(c.categoryName, SUM(od.unitPrice * od.quantity * (1 - od.discount)))" +
                                " FROM OrderDetail od JOIN od.product p JOIN od.order so JOIN p.category c" +
                                " WHERE so.orderDate BETWEEN :from AND :to GROUP BY c", NameValueDto.class)
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();
    }

    // JPQL: SELECT NEW info.saladlam.example.jpa.northwind.dto.NameValueDto(CONCAT(e.firstname, ' ', e.lastname), SUM(od.unitPrice * od.quantity * (1 - od.discount)) as sales) FROM OrderDetail od JOIN od.order so JOIN so.employee e WHERE so.orderDate BETWEEN :from AND :to GROUP BY e ORDER BY sales DESC
    @Override
    public List<NameValueDto> totalSalesByStaffBetweenDate(LocalDateTime from, LocalDateTime to) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<NameValueDto> query = cb.createQuery(NameValueDto.class);
        Root<OrderDetail> od = query.from(OrderDetail.class);
        Join<OrderDetail, SalesOrder> joinOdSo = od.join("order");
        Join<SalesOrder, Employee> joinSoE = joinOdSo.join("employee");
        Expression<BigDecimal> sales = cb.sum(cb.prod(od.get("unitPrice"), cb.prod(od.get("quantity"), cb.diff(new BigDecimal("1"), od.get("discount")))));

        query.select(cb.construct(NameValueDto.class, cb.concat(joinSoE.get("firstname"), cb.concat(" ", joinSoE.get("lastname"))), sales))
                .where(cb.between(joinOdSo.get("orderDate"), cb.parameter(LocalDateTime.class, "from"), cb.parameter(LocalDateTime.class, "to")))
                .groupBy(joinSoE)
                .orderBy(cb.desc(sales));
        return em.createQuery(query).setParameter("from", from).setParameter("to", to).getResultList();
    }

}
