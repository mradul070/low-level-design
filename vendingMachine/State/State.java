package vendingMachine.State;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import java.util.*;
public interface State {
    public void clickOnInsertPayment(VendingMachine vendingMachine);
    public void insertCoin(VendingMachine vendingMachine, Coin coin);
    public void selectProduct(VendingMachine vendingMachine);
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;
    public void changeProduct(VendingMachine vendingMachine);
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;
    public List<Coin> refundAmount(VendingMachine vendingMachine);
    public List<Coin> getChange(int amount, VendingMachine vendingMachine);
    public void confirmProduct(VendingMachine vendingMachine, int code) throws Exception;
}
