package vendingMachine.getAmountResponsiblity;

import vendingMachine.Coin;

public class PlatinumPaymentHandle extends MakePaymentHandler {

    public PlatinumPaymentHandle(MakePaymentHandler nextPaymentHandler) {
        super(nextPaymentHandler);
    }
    @Override
    public void requestPayment(int amount) {
        int coin = amount /10;
        amount = amount % 10;
        super.setRefundCoin(Coin.PLATINUM, coin);
        if (amount > 0) super.requestPayment(amount);
    }
    
}