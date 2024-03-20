package designpattern.decorator;

public class MainDriver {
    public static void main(String[] args) {
        PaymentCalulation paymentCalulation = new BaseAmount();
        paymentCalulation = new GatewayFee(paymentCalulation);
        paymentCalulation = new ProcessingFee(paymentCalulation);

        double totalAmount = paymentCalulation.calculateTotalAmount(100);
        System.out.println(totalAmount);
    }
}
