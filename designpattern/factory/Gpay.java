package designpattern.factory;

import java.util.Random;

public class Gpay implements Payment {
    @Override
    public PaymentResponse makePayment(double amount, String virtualAddress) {
        System.out.println("Payment done through gpay");
        return new PaymentResponse(amount, virtualAddress, false, new Random().nextInt(100000));
    }
}
