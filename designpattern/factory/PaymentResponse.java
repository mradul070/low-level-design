package designpattern.factory;

public class PaymentResponse {
    double amount;
    String virtualAddress;
    boolean success;
    int transactionId;

    PaymentResponse(double amount, String virtualAddress, boolean success, int transactionId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.success = success;
        this.virtualAddress = virtualAddress;
    }
}
