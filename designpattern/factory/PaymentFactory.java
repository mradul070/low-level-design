package designpattern.factory;

public class PaymentFactory {
    PaymentFactory() {}
    public static Payment processPayment(PaymentTypeEnum paymentTypeEnum) {
        switch (paymentTypeEnum) {
            case GPAY:
                return new Gpay();
            case PHONEPE:
                return new PhonePe();
            default:
                return null;
        }
    }
}
