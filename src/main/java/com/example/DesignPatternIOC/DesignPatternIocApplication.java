package com.example.DesignPatternIOC;

import com.example.DesignPatternIOC.creaditCard.Customer;
import com.example.DesignPatternIOC.creaditCard.CustomerSetter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DesignPatternIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternIocApplication.class, args);
    }

    // CommandLineRunner 會在應用啟動後自動執行
    @Bean
    @Profile("!test")  // 測試環境不建立這個 Runner
    public CommandLineRunner fieldInjectionRunner(Customer customer) {
        return args -> {
            System.out.println("[Field Injection] " + customer.makePayment(1000));
        };
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner setterInjectionRunner(CustomerSetter customerSetter) {
        return args -> {
            System.out.println("[Setter Injection] " + customerSetter.makePayment(1500));
        };
    }
}
