package TicTacToe;

import java.util.Scanner;

public class GameBoard {
    private char[][] square;


    GameBoard(int size) {
        square = new char[size][size];
    }

    public void play(char symbol, int n1, int n2) {
        if (square[n1][n2] == 'o' || square[n1][n2] == 'x') {
            System.out.println("Position is busy. Change the position");
            Scanner in = new Scanner(System.in);
            int n11 = in.nextInt();
            int n22 = in.nextInt();
            square[n11][n22] = symbol;
        } else {
            square[n1][n2] = symbol;
        }
        for (int i = 0; i < square.length; ++i) {
            for (int j = 0; j < square.length; ++j) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void gameIsFineshed(GameBoard game) {
        if

    }
}
