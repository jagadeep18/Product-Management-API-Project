package com.example.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 🔹 Disables JPA
public class ProductManagementApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductManagementApiApplication.class, args);
    }
}
