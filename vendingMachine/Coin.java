package vendingMachine;

public enum Coin {
    SILVER(1),
    GOLD(5),
    PLATINUM(10);
    public final int value;
    Coin(int value) {this.value  = value;}
}
