package designpattern.factory;

public interface Payment {
    public PaymentResponse makePayment(double amount, String virtualAddress);
}