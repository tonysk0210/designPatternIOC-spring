package com.example.DesignPatternIOC;

import creaditCard.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignPatternIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternIocApplication.class, args);
    }

    // CommandLineRunner 會在應用啟動後自動執行
    @Bean
    public CommandLineRunner run(Customer customer) {
        return args -> {
            System.out.println(customer.makePayment(1000));
        };
    }
}
