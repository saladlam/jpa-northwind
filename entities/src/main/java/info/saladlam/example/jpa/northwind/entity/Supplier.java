package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Supplier")
public class Supplier {

    @Id
    @Column(name = "supplierId")
    private Integer supplierId;
    @Column(name = "companyName", length = 40, nullable = false)
    private String companyName;
    @Column(name = "contactName", length = 30)
    private String contactName;
    @Column(name = "contactTitle", length = 30)
    private String contactTitle;
    @Column(name = "address", length = 60)
    private String address;
    @Column(name = "city", length = 15)
    private String city;
    @Column(name = "region", length = 15)
    private String region;
    @Column(name = "postalCode", length = 10)
    private String postalCode;
    @Column(name = "country", length = 15)
    private String country;
    @Column(name = "phone", length = 24)
    private String phone;
    @Column(name = "email", length = 225)
    private String email;
    @Column(name = "fax", length = 24)
    private String fax;
    @Lob
    @Column(name = "HomePage")
    private String HomePage;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String homePage) {
        HomePage = homePage;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierId, supplier.supplierId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(supplierId);
    }

}
