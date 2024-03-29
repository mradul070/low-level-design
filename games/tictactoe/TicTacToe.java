package games.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

import games.Game;

public class TicTacToe extends Game {
    private String board[][];
    private PlayerSign playerSign;
    private int userMove = 0;
    @Override
    protected void initializeBoard(int n) {
        board = new String[n][n];
        playerSign = PlayerSign.O;
        for (String[] str: board) {
            Arrays.fill(str, "_");
        }
    }

    @Override
    protected boolean isGameOver() {
        if (userMove == (board.length * board.length)) {
            playerSign = PlayerSign.XO;
            return true;
        }
        // row check
        for (int i = 0; i < board.length; i++) {
            boolean rowCheck = true;
            for (int j = 0; j < board[i].length; j++) {
                if (!board[i][j].equals(playerSign.name())) {
                    rowCheck = false;
                    break;
                }
            }
            if (rowCheck) return true;
        }
        for (int j = 0; j < board[0].length; j++) {
            boolean colCheck = true;
            for (int i = 0; i < board.length; i++) {
                if (!board[i][j].equals(playerSign.name())) {
                    colCheck = false;
                    break;
                }
            }
            if (colCheck) return true;
        }
        boolean diagonalCheck = true;
        for (int i = 0; i < board.length; i++) {
            if (!board[i][i].equals(playerSign.name())) {
                diagonalCheck = false;
                break;
            }
        }
        if (diagonalCheck) return true;
        boolean revDiagonalCheck = false;
        for (int i = 0; i < board.length; i++) {
            if (!board[i][board.length - 1 - i].equals(playerSign.name())) {
                revDiagonalCheck = false;
                break;
            }
        }
        if (revDiagonalCheck) return true;
        return false;
    }

    @Override
    protected void displayBoard() {
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j< board[0].length; j++) {
                System.out.print(board[i][j] +"     ");
            }
            System.out.println();
        }
    }

    @Override
    protected void move() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        if (!board[row][col].equals("_")) {
            System.out.println("This number is already taken try again ");
            move();
        }
        userMove++;
        board[row][col] = playerSign.toString();
    }

    @Override
    protected void displayWinner() {
        String winner = (playerSign.name().equals(PlayerSign.XO.name())) ? "Match draw" : playerSign + " is a wineer";
        System.out.println(winner);
    }

    @Override
    protected void takeTurn() {
        if (playerSign.equals(PlayerSign.O)) playerSign = PlayerSign.X;
        else playerSign = PlayerSign.O;
    }
    
}
