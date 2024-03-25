package vendingMachine.getAmountResponsiblity;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

import vendingMachine.Coin;

public abstract class MakePaymentHandler {
    private MakePaymentHandler nextPaymentHandler;
    private static HashMap<Coin, Integer> hs;
    static {
        hs = new HashMap<>();
    }
    public MakePaymentHandler(MakePaymentHandler nextPaymentHandler) {
        this.nextPaymentHandler = nextPaymentHandler;
    }
    public void requestPayment(int amount) {
        if (nextPaymentHandler != null)
            this.nextPaymentHandler.requestPayment(amount);
    }
    public void setRefundCoin(Coin coin, int count) {
        this.hs.put(coin, count);
    }
    public HashMap<Coin, Integer>  getRefundCoin() {
        return hs;
    }

}
