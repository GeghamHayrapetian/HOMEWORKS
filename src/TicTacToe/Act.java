package TicTacToe;

import java.util.Scanner;

public class Act {
    public static boolean checkDiagonal(char xo, GameBoard game, int p1, int p2) {
        boolean right = true;
        boolean left = true;
        for (int i=0; i<game.getWinerposition(); i++) {
            right &= (game.getSquare()[i+p1][i+p2] == xo);
            left &= (game.getSquare()[game.getWinerposition()-i-1+p1][i+p2] == xo);
        }

        if (right || left) return true;

        return false;
    }

    public  static boolean checkLines(char xo, GameBoard game, int p1, int p2) {
        boolean contour = true;
        boolean vertikal = true;
        for (int i = 0; i < game.getWinerposition(); ++i) {
            contour &=  (game.getSquare()[p1][p2 + i] == xo);
            vertikal &= (game.getSquare()[p1 + i][p2] == xo);
        }
        if (contour || vertikal) {
            return true;
        }
        return false;

    }

    public static boolean win(GameBoard game, char xo) {
        for (int i = 0; i < game.getSize() - game.getWinerposition() + 1; ++i) {
            for (int j = 0; j < game.getSize() - game.getWinerposition() + 1; ++j) {
                if (checkLines(xo, game, i, j) || checkDiagonal(xo, game, i, j))
                    return true;
            }
        }
        return false;
    }


}



