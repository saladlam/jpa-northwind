package info.saladlam.example.jpa.northwind.repository;

import info.saladlam.example.jpa.northwind.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionRepository extends JpaRepository<Region, Integer>, JpaSpecificationExecutor<Region> {
}
