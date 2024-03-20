package designpattern.abstractFactory;

public interface Payment {
    public PaymentResponse makePayment(double amount);
}
