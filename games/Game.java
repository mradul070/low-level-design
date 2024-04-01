package games;

public abstract class Game {
    public final void play(int n) {
        initializeBoard(n);
        while (!isGameOver()) {
            // System.out.println(isGameOver());
            displayBoard();
            move();
            boolean isGameOver = isGameOver();
            if (isGameOver) break;
            takeTurn();
        }
        displayWinner();
    }
    protected abstract void takeTurn();
    protected abstract void initializeBoard(int n);
    protected abstract boolean isGameOver();
    protected abstract void displayBoard();
    protected abstract void move();
    protected abstract void displayWinner();
}
