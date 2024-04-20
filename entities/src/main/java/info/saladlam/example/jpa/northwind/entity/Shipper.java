package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Shipper")
public class Shipper {

    @Id
    @Column(name = "shipperId")
    private Integer shipperId;
    @Column(name = "companyName", length = 40, nullable = false)
    private String companyName;
    @Column(name = "phone", length = 44)
    private String phone;

    @OneToMany(mappedBy = "shipper")
    private List<SalesOrder> salesOrders;

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipper shipper = (Shipper) o;
        return Objects.equals(shipperId, shipper.shipperId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(shipperId);
    }

}
