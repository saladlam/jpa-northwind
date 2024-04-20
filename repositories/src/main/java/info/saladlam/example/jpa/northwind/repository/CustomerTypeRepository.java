package info.saladlam.example.jpa.northwind.repository;

import info.saladlam.example.jpa.northwind.entity.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer>, JpaSpecificationExecutor<CustomerType> {
}
