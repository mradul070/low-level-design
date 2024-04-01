package games.SnakeAndLadder;

import games.Game;
import java.util.Random;
import java.util.HashMap;
public class SnakeAndLadder extends Game{
    private int board[][];
    private Player player1;
    private Player player2 = new Player("player2");
    private Player currentPlayer;
    HashMap<Integer, Integer> ladder;
    HashMap<Integer, Integer> snake;
    @Override
    protected void takeTurn() {
        if (currentPlayer.getName().equals("player2"))
            currentPlayer = player1;
        else
            currentPlayer = player2;
    }

    @Override
    protected void initializeBoard(int n) {
        board = new int[n+1][n+1];
        player1 = new Player("player1");
        player2 = new Player("player2");
        ladder = new HashMap<>();
        snake = new HashMap<>();
        currentPlayer = player1;
        ladder.put(10, 33);
        ladder.put(15, 45);
        ladder.put(12, 22);
        ladder.put(43, 63);

        snake.put(98, 65);
        snake.put(75, 23);
        snake.put(35, 6);
        snake.put(64, 15);
    }

    @Override
    protected boolean isGameOver() {
        if (player1.getPosition() == 100 || player2.getPosition() == 100) return true;
        return false;
    }

    @Override
    protected void displayBoard() {

    }

    @Override
    protected void move() {
        int diceRoll = new Random().nextInt(6) +1;
        if (currentPlayer.getPosition() + diceRoll > 100) return;
        currentPlayer.setPosition(currentPlayer.getPosition() + diceRoll);
        if (ladder.get(currentPlayer.getPosition()) != null || snake.get(currentPlayer.getPosition()) != null) {
            int newPosition = ladder.get(currentPlayer.getPosition()) != null ? ladder.get(currentPlayer.getPosition()) : snake.get(currentPlayer.getPosition());
            currentPlayer.setPosition(newPosition);
        }
        int row = currentPlayer.getPosition() / 10;
        int col = currentPlayer.getPosition() % 10;
        board[row][col] = currentPlayer.getPosition();
        System.out.println(currentPlayer.getName() + " dice " + diceRoll + " move  " +  currentPlayer.getPosition());
    }

    @Override
    protected void displayWinner() {
        System.out.println(currentPlayer.getName());
    }
    
}
