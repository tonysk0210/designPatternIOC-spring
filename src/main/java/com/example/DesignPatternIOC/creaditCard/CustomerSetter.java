package com.example.DesignPatternIOC.creaditCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Setter 注入示範，透過 {@link #setPaymentMethod(PaymentMethod)} 將 IoC 容器中的 PaymentMethod 設入。
 */
@Component
public class CustomerSetter {

    private PaymentMethod paymentMethod;

    @Autowired
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String makePayment(int cents) {
        return paymentMethod.pay(cents);
    }
}
