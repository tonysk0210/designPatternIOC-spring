package com.example.DesignPatternIOC;

import com.example.DesignPatternIOC.creaditCard.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class DesignPatternIocApplicationTests {

    @Autowired
    Customer customer;

    @Test
    void contextLoads() {
        String result = customer.makePayment(500);
        System.out.println(assertThat(result).contains("500"));
    }

}
