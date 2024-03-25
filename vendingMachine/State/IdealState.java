package vendingMachine.State;

import java.util.ArrayList;
import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class IdealState implements State {

    @Override
    public void clickOnInsertPayment(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
        System.out.println("System is accepting payment please insert coin");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public void changeProduct(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeProduct'");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Coin> refundAmount(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundAmount'");
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
    public List<Coin> getChange(int amount, VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void confirmProduct(VendingMachine vendingMachine, int code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmProduct'");
    }
    
}
