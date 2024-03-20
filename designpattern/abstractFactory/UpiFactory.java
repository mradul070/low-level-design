package designpattern.abstractFactory;

public class UpiFactory implements ProcessPayment {
    public Payment createFactory(PaymentTypeEnum paymentTypeEnum) {
        switch (paymentTypeEnum) {
            case PHONEPE:
                return new PhonePe();
            case GPAY:
                return new Gpay();
            default:
                return null;
        }
    }

    @Override
    public boolean validateCardDetails(String cardNumber, int cvv, String expirationDate) {
        throw new UnsupportedOperationException("Unimplemented method 'validateCardDetails'");
    }

    @Override
    public boolean validateUpi(String virtualAddres) {
        return true;
    }
}
