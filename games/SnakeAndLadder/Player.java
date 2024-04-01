package games.SnakeAndLadder;

public class Player {
    private int position;
    private String name;

    Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }
}
