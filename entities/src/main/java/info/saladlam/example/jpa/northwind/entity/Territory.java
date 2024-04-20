package info.saladlam.example.jpa.northwind.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Territory")
public class Territory {

    @Id
    @Column(name = "territoryId", length = 20, nullable = false)
    private String territoryId;
    // rename
    @Column(name = "territorydescription", length = 50, nullable = false)
    private String territoryDescription;
    @ManyToOne
    @JoinColumn(name = "regionId", nullable = false)
    private Region region;

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Territory territory = (Territory) o;
        return Objects.equals(territoryId, territory.territoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(territoryId);
    }

}
