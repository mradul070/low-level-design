package vendingMachine;

public class Item {
    private ItemType itemType;
    private int price;

    public ItemType getType() {
        return this.itemType;
    }
    public void setType(ItemType itemType) {
        this.itemType = itemType;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
