package info.saladlam.example.jpa.northwind.repository;

import info.saladlam.example.jpa.northwind.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShipperRepository extends JpaRepository<Shipper, Integer>, JpaSpecificationExecutor<Shipper> {
}
