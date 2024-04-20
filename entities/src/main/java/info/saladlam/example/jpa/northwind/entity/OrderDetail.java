package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {

    @Id
    @Column(name = "orderDetailId")
    private Integer orderDetailId;
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private SalesOrder order;
    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;
    @Column(name = "unitPrice", nullable = false)
    private BigDecimal unitPrice;
    @Column(name = "quantity", nullable = false)
    private Short quantity;
    @Column(name = "discount", nullable = false)
    private BigDecimal discount;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public SalesOrder getOrder() {
        return order;
    }

    public void setOrder(SalesOrder order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return Objects.equals(orderDetailId, that.orderDetailId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderDetailId);
    }

}
