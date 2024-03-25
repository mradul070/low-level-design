package vendingMachine;

import java.util.Random;

import vendingMachine.State.State;
import vendingMachine.getAmountResponsiblity.*;


public class Main {
    public static void main(String[] args) {
        try {
        MakePaymentHandler handler = new PlatinumPaymentHandle(new GoldPaymentHandler(new SilverPaymentHandler(null)));
        VendingMachine vendingMachine = new VendingMachine(handler);
        fillingUpInventory(vendingMachine);
        displayInventory(vendingMachine);

        State state = vendingMachine.getState();
        state.clickOnInsertPayment(vendingMachine); 

        state = vendingMachine.getState();
        state.insertCoin(vendingMachine, Coin.PLATINUM);
        state.insertCoin(vendingMachine, Coin.SILVER);
        state.insertCoin(vendingMachine, Coin.SILVER);
        state.selectProduct(vendingMachine);
        state = vendingMachine.getState();
        state.chooseProduct(vendingMachine, 102);
        state = vendingMachine.getState();
        state.confirmProduct(vendingMachine, 102);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    private static void fillingUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelfs = vendingMachine.getInventory().getInventory();
        for (ItemShelf itemShelf : itemShelfs) {
            int price = new Random().nextInt(20);
            ItemType itemType = getItemType();
            Item item = new Item();
            item.setPrice(price);
            item.setType(itemType);
            itemShelf.setItem(item);
            itemShelf.setSoldOut(false);
        }
    }
    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelfs = vendingMachine.getInventory().getInventory();
        for (ItemShelf itemShelf : itemShelfs) {
            System.out.println("Code Nuber: " + itemShelf.getCode() + " Price: " + itemShelf.getItem().getPrice()
            + " Type: " + itemShelf.getItem().getType());
        }
    }
    private static ItemType getItemType() {
        int val = new Random().nextInt(4);
        switch (val) {
            case 1:  
                return ItemType.SNACK;
            case 2:
                return ItemType.SODA;
            case 3:
                return ItemType.SOFT_DRINK;
            default:
                return ItemType.WATER;
        }
    }
}
