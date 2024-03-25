package vendingMachine;

import java.util.ArrayList;
import java.util.List;

import vendingMachine.State.IdealState;
import vendingMachine.State.State;
import vendingMachine.getAmountResponsiblity.MakePaymentHandler;;

public class VendingMachine {
    private Inventory inventory;
    private List<Coin> coin;
    private State state;
    private MakePaymentHandler handler;
    public VendingMachine(MakePaymentHandler handler) {
        state = new IdealState();
        inventory = new Inventory(10);
        coin = new ArrayList<>();
        this.handler = handler;
    }
    public State getState() { return state; };
    public void setVendingMachineState(State state) {
        this.state= state;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public List<Coin> getCoin() {
        return coin;
    }
    public void setCoin(List<Coin> coin) {
        this.coin = coin;
    }
    public MakePaymentHandler getHandler() {
        return handler;
    }
}
