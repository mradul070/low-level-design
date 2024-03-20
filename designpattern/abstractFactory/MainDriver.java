package designpattern.abstractFactory;
import java.util.ArrayList;

public class MainDriver {
    public static void main(String[] args) {
        ArrayList<PaymentResponse> response = new ArrayList<>();
        ProcessPayment cardFactory = new CardFactory();
        if (cardFactory.validateCardDetails("4242424242424242", 123, "12/12")) {
            Payment payment = cardFactory.createFactory(PaymentTypeEnum.CREDITCARD);
            PaymentResponse paymentResponse = payment.makePayment(100);
            response.add(paymentResponse);
        }
    }
}
