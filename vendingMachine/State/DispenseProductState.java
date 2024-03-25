package vendingMachine.State;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class DispenseProductState implements State  {
    private VendingMachine vendingMachine;
    private int count;
    public DispenseProductState(VendingMachine vendingMachine, int code) throws Exception {
        this.vendingMachine = vendingMachine;
        this.count = count;
        dispenseProduct(vendingMachine, code);
    }
    @Override
    public void clickOnInsertPayment(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertPayment'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public void changeProduct(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeProduct'");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItemByCode(code);
        System.out.println(item.getType() + "----- " +item.getPrice());
        return item;
    }

    @Override
    public List<Coin> refundAmount(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundAmount'");
    }

    @Override
    public List<Coin> getChange(int amount, VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void confirmProduct(VendingMachine vendingMachine, int code) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmProduct'");
    }
    
}
