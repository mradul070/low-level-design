package designpattern.abstractFactory;

public interface ProcessPayment {
    public Payment createFactory(PaymentTypeEnum paymentTypeEnum);
    public boolean validateCardDetails(String cardNumber, int cvv, String expirationDate);
    public boolean validateUpi(String virtualAddres);
}
