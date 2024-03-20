package designpattern.abstractFactory;

public class CardFactory implements ProcessPayment {
    public Payment createFactory(PaymentTypeEnum paymentTypeEnum) {
        switch (paymentTypeEnum) {
            case DEBITCARD:
                return new DebitCard();
            case CREDITCARD:
                return new CreditCard();
            default:
                return null;
        }
    }

    @Override
    public boolean validateCardDetails(String cardNumber, int cvv, String expirationDate) {
        return true;
    }

    @Override
    public boolean validateUpi(String virtualAddres) {
        throw new UnsupportedOperationException("Unimplemented method 'validateUpi'");
    }
}
