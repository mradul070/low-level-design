package vendingMachine.State;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class SelectionState implements State {

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
        Item item = vendingMachine.getInventory().getItemByCode(code);
        List<Coin> ls = vendingMachine.getCoin();
        int totalUserPaid = 0;
        for (Coin c: ls) {
            totalUserPaid += c.value;
        }
        if (item.getPrice() > totalUserPaid) {
            throw new Exception("Insufficient Fund");
        } else {
            vendingMachine.setVendingMachineState(new ConfirmState());
        }
        System.out.println("You have taken " + item.getType());
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
        List<Coin> coin  = vendingMachine.getCoin();
        vendingMachine.setVendingMachineState(new IdealState());
        return coin;
    }

    @Override
    public List<Coin> getChange(int amount, VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void confirmProduct(VendingMachine vendingMachine,int code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmProduct'");
    }

}
