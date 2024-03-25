package vendingMachine.getAmountResponsiblity;

import vendingMachine.Coin;

public class SilverPaymentHandler  extends MakePaymentHandler{

      public SilverPaymentHandler(MakePaymentHandler nextPaymentHandler) {
        super(nextPaymentHandler);
    }
    @Override
    public void requestPayment(int amount) {
        int coin = amount /1;
        amount = amount % 1;
        super.setRefundCoin(Coin.SILVER, coin);
        if (amount > 0) super.requestPayment(amount);
    }
}
