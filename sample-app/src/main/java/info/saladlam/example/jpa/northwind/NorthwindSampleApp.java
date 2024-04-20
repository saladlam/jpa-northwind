package info.saladlam.example.jpa.northwind;

import info.saladlam.example.jpa.northwind.service.BusinessAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class NorthwindSampleApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NorthwindSampleApp.class, args);
    }

    @Autowired
    private BusinessAnalysisService service;

    @Override
    public void run(String... args) {
        System.out.println("\nList the name of staff and his/her supervisor\nStaff, Supervisor");
        service.listNameOfStaffAndSupervisor()
                .forEach(v -> System.out.printf("%s, %s%n", v.getName(), v.getValue()));

        System.out.println("\nTotal sales by category between 2006-10-01 and 2006-10-31\nCategory, Sales");
        service.totalSalesByCategoryBetweenDate(LocalDateTime.of(2006, 10, 1, 0, 0, 0), LocalDateTime.of(2026, 10, 31, 23, 59, 59))
                .forEach(v -> System.out.printf("%s, %s%n", v.getName(), v.getValue()));


        System.out.println("\nTotal sales by staff between 2006-10-01 and 2006-10-31\nStaff, Sales");
        service.totalSalesByStaffBetweenDate(LocalDateTime.of(2006, 10, 1, 0, 0, 0), LocalDateTime.of(2026, 10, 31, 23, 59, 59))
                .forEach(v -> System.out.printf("%s, %s%n", v.getName(), v.getValue()));
    }

}
