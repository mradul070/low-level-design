package games;

import games.SnakeAndLadder.SnakeAndLadder;
import games.tictactoe.TicTacToe;;
public class MainDriver {
    public static void main(String[] args) {
        Game g = new SnakeAndLadder();
        g.play(10);
    }
}
