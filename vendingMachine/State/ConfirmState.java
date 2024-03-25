package vendingMachine.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class ConfirmState implements State {
    ConfirmState() {
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
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) {
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
        System.out.println("Your remaining amount is processing" + amount);
        vendingMachine.getHandler().requestPayment(amount);
        HashMap<Coin, Integer> hs = vendingMachine.getHandler().getRefundCoin();
        List<Coin> al = new ArrayList<>();
        for (Map.Entry<Coin, Integer> e: hs.entrySet()) {
            int count = e.getValue();
            while (count > 0) {
                al.add(e.getKey());
                count--;
            }
        }
        return al;
    }

    @Override
    public void confirmProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItemByCode(code);
        int totalUserPaid = 0;
        for (Coin c : vendingMachine.getCoin()) {
            totalUserPaid += c.value;
        }
        if (totalUserPaid > item.getPrice()) {
            getChange(totalUserPaid - item.getPrice(), vendingMachine);
        }
        vendingMachine.setVendingMachineState(new DispenseProductState(vendingMachine, code));  
    }
}
