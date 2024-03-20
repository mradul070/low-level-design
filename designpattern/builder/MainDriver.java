package designpattern.builder;

public class MainDriver {
    public static void main(String[] args) {
        RequestBody cardPaymentBody = new RequestBody.RequestBuilder()
        .setCardNumber("4242424242424242")
        .setCvv(123)
        .setExpiryDate("11/25").build();

        RequestBody upiPaymentBody = new RequestBody.RequestBuilder()
        .setVirtualAddress("mradul@ybl").build();
    }
}
