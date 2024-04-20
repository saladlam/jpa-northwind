package info.saladlam.example.jpa.northwind.repository;

import info.saladlam.example.jpa.northwind.entity.Territory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TerritoryRepository extends JpaRepository<Territory, String>, JpaSpecificationExecutor<Territory> {
}
