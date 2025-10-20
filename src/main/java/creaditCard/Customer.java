package creaditCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Autowired
    private PaymentMethod paymentMethod;

    public Customer(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String makePayment(int cents) {
        return paymentMethod.pay(cents);
    }
}
