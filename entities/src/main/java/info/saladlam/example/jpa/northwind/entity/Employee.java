package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "employeeId")
    private Integer employeeId;
    @Column(name = "lastname", length = 20, nullable = false)
    private String lastname;
    @Column(name = "firstname", length = 10, nullable = false)
    private String firstname;
    @Column(name = "title", length = 30)
    private String title;
    @Column(name = "titleOfCourtesy", length = 25)
    private String titleOfCourtesy;
    @Column(name = "birthDate")
    private LocalDateTime birthDate;
    @Column(name = "hireDate")
    private LocalDateTime hireDate;
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
    @Column(name = "extension", length = 4)
    private String extension;
    @Column(name = "mobile", length = 24)
    private String mobile;
    @Column(name = "email", length = 225)
    private String email;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Lob
    @Column(name = "notes")
    private byte[] notes;
    @ManyToOne
    @JoinColumn(name = "mgrId")
    private Employee manager;
    @Column(name = "photoPath", length = 255)
    private String photoPath;

    @OneToMany(mappedBy = "manager")
    private List<Employee> assistants;
    @OneToMany
    @JoinTable(name = "EmployeeTerritory", joinColumns = @JoinColumn(name = "employeeId"), inverseJoinColumns = @JoinColumn(name = "territoryId"))
    private List<Territory> territories;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getNotes() {
        return notes;
    }

    public void setNotes(byte[] notes) {
        this.notes = notes;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public List<Employee> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Employee> assistants) {
        this.assistants = assistants;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeId);
    }

}
