package designpattern.factory;

import java.util.ArrayList;

class MainDriver {
    public static void main(String[] args) {
        ArrayList<PaymentResponse> response = new ArrayList<>();
        Payment paymentFactory = PaymentFactory.processPayment(PaymentTypeEnum.GPAY);
        PaymentResponse paymentRespone = paymentFactory.makePayment(1000, "mradul@ybl");
        response.add(paymentRespone);
    }
}