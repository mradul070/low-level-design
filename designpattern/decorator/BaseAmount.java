package designpattern.decorator;

public class BaseAmount extends PaymentCalulation {

    @Override
    public double calculateTotalAmount(double originalAmmount) {
        return originalAmmount;
    }
    
}
