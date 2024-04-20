package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "productName", length = 40, nullable = false)
    private String productName;
    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
    @Column(name = "quantityPerUnit", length = 20)
    private String quantityPerUnit;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;
    @Column(name = "unitsInStock")
    private Short unitsInStock;
    @Column(name = "unitsOnOrder")
    private Short unitsOnOrder;
    @Column(name = "reorderLevel")
    private Short reorderLevel;
    @Column(name = "discontinued", nullable = false)
    private Character discontinued;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Character getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Character discontinued) {
        this.discontinued = discontinued;
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
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }

}
