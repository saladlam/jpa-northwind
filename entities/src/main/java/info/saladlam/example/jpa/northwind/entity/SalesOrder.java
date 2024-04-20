package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SalesOrder")
public class SalesOrder {

    @Id
    @Column(name = "orderId")
    private Integer orderId;
    @ManyToOne
    @JoinColumn(name = "custId", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @Column(name = "orderDate")
    private LocalDateTime orderDate;
    @Column(name = "requiredDate")
    private LocalDateTime requiredDate;
    @Column(name = "shippedDate")
    private LocalDateTime shippedDate;
    @ManyToOne
    @JoinColumn(name = "shipperid", nullable = false)
    private Shipper shipper;
    @Column(name = "freight")
    private BigDecimal freight;
    @Column(name = "shipName", length = 40)
    private String shipName;
    @Column(name = "shipAddress", length = 60)
    private String shipAddress;
    @Column(name = "shipCity", length = 15)
    private String shipCity;
    @Column(name = "shipRegion", length = 15)
    private String shipRegion;
    @Column(name = "shipPostalCode", length = 10)
    private String shipPostalCode;
    @Column(name = "shipCountry", length = 15)
    private String shipCountry;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDateTime requiredDate) {
        this.requiredDate = requiredDate;
    }

    public LocalDateTime getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDateTime shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesOrder that = (SalesOrder) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderId);
    }

}
