package designpattern.decorator;

public class GatewayFee extends AmountDecorator {

    GatewayFee(PaymentCalulation paymentCalulation) {
        super(paymentCalulation);
    }
    @Override
    public double calculateTotalAmount(double originalAmmount) {
        return super.calculateTotalAmount(originalAmmount) + 1;
    }
}
