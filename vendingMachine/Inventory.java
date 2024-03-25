package vendingMachine;

public class Inventory {
    ItemShelf[] inventory;
    public Inventory(int n) {
        inventory = new ItemShelf[n];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }
    private void initialEmptyInventory() {
        int code = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(code);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            code++;
        }
    }
    private void addItem(Item item, int code) throws Exception {
        for (ItemShelf itemShelf: inventory) {
            if (itemShelf.getCode() == code) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Item is already present you can't add new item");
                }
            }
        }
    }
    public Item getItemByCode(int code) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == code) {
                if (!itemShelf.isSoldOut()) {
                    return itemShelf.getItem();
                } else {
                    throw new Exception("This product is currently not available");
                }
            }
        }
        throw new Exception("No such item found");
    }
    
}
