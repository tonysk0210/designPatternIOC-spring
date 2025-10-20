package creaditCard;

import org.springframework.stereotype.Component;

@Component  // 讓 Spring 自動註冊成 Bean
public class CreditCard implements PaymentMethod {
    @Override
    public String pay(int cents) {
        return "Paid " + cents + " cents with credit card";
    }
}
