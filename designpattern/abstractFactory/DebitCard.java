package designpattern.abstractFactory;
import java.util.Random;
public class DebitCard implements Payment {
    @Override
    public PaymentResponse makePayment(double amount) {
        return new PaymentResponse(amount, true, new Random().nextInt(100000));
    }
}
