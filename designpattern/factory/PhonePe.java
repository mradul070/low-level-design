package designpattern.factory;

import java.util.Random;

public class PhonePe implements Payment {
    @Override
    public PaymentResponse makePayment(double amount, String virtualAddress) {
        System.out.println("Payment done through phonepe");
        return new PaymentResponse(amount, virtualAddress, false, new Random().nextInt(100000));
    }
}
