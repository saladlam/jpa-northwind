package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Region")
public class Region {

    @Id
    @Column(name = "regionId")
    private Integer regionId;
    // rename
    @Column(name = "regiondescription", length = 50, nullable = false)
    private String regionDescription;

    @OneToMany(mappedBy = "region")
    private List<Territory> territories;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
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
        Region region = (Region) o;
        return Objects.equals(regionId, region.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regionId);
    }

}
