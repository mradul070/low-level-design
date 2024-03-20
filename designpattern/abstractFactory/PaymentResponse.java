package designpattern.abstractFactory;

public class PaymentResponse {
    double amount;
    boolean success;
    int transactionId;

    PaymentResponse(double amount, boolean success, int transactionId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.success = success;
    }
}
