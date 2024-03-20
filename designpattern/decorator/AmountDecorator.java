package designpattern.decorator;

public class AmountDecorator extends PaymentCalulation {
    protected PaymentCalulation paymentCalulation;
    AmountDecorator(PaymentCalulation paymentCalulation)  {
        this.paymentCalulation = paymentCalulation;
    }
    @Override
    public double calculateTotalAmount(double originalAmmount) {
        return paymentCalulation.calculateTotalAmount(originalAmmount);
    }
    
}
