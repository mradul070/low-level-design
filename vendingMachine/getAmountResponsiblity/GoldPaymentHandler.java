package vendingMachine.getAmountResponsiblity;

import vendingMachine.Coin;

public class GoldPaymentHandler  extends  MakePaymentHandler{
    
    public GoldPaymentHandler(MakePaymentHandler nextPaymentHandler) {
        super(nextPaymentHandler);
    }
    @Override
    public void requestPayment(int amount) {
        int coin = amount /5;
        amount = amount % 5;
        super.setRefundCoin(Coin.GOLD, coin);
        if (amount > 0) super.requestPayment(amount);
    }
}
