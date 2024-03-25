package vendingMachine.State;

import java.util.ArrayList;
import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class HasMoneyState implements State {

    @Override
    public void clickOnInsertPayment(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertPayment'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        if (vendingMachine.getCoin().size() == 0) {
            vendingMachine.setCoin(new ArrayList<>());
        }
        vendingMachine.getCoin().add(coin);

        System.out.println(coin.value + "Rs. coin added successfully");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new SelectionState());
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
    public Item dispenseProduct(VendingMachine vendingMachine, int code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Coin> refundAmount(VendingMachine vendingMachine) {
        List<Coin> ls = vendingMachine.getCoin();
        vendingMachine.setVendingMachineState(new IdealState());
        return ls;
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
