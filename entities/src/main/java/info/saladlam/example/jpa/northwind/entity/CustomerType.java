package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CustomerDemographics")
public class CustomerType {

    @Id
    @Column(name = "customerTypeId")
    private Integer customerTypeId;
    @Lob
    @Column(name = "customerDesc")
    private String customerDesc;

    @ManyToMany
    @JoinTable(name = "CustCustDemographics", joinColumns = @JoinColumn(name = "customerTypeId"), inverseJoinColumns = @JoinColumn(name = "custId"))
    private List<Customer> customers;

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerType that = (CustomerType) o;
        return Objects.equals(customerTypeId, that.customerTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(customerTypeId);
    }

}
