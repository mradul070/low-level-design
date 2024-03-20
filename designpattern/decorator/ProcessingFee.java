package designpattern.decorator;

public class ProcessingFee extends AmountDecorator {

    ProcessingFee(PaymentCalulation paymentCalulation) {
        super(paymentCalulation);
    }

    @Override
    public double calculateTotalAmount(double originalAmmount) {
        double amount = originalAmmount * 0.02;
        return super.calculateTotalAmount(originalAmmount) + amount;
    }

    
}
