package games;

import games.tictactoe.TicTacToe;;
public class MainDriver {
    public static void main(String[] args) {
        Game g = new TicTacToe();
        g.play(3);
    }
}
