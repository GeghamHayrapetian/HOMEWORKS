package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time, size, position, score1, score2;
        score1 = 0;
        score2 = 0;
        System.out.println("Enter the first player name");
        System.out.println("Enter the second player name");
        String player1 = in.nextLine();
        String player2 = in.nextLine();
        System.out.println("How manny times will you play");
        time = in.nextInt();
        for (int t = 0; t < time; ++t) {
            System.out.println("Choose the size of board");
            size = in.nextInt();
            System.out.println("Choose the configuration of winning condition");
            position = in.nextInt();
            GameBoard game = new GameBoard(size, position);
            for (int i = 0; i < game.getSize()*game.getSize(); ++i) {
                System.out.println("Enter the position");
                int position1 = in.nextInt();
                int position2 = in.nextInt();
                if ((i % 2) == 0)
                    game.play('x', position1, position2);
                else
                    game.play('o', position1, position2);
                if (i>=position)
                    if(Act.win(game,'x')||Act.win(game,'0')) {
                        if (i % 2 == 0) {
                            System.out.println(player1+ " win");
                            ++score1;
                        }
                        else{
                            System.out.println(player2+" win");
                            ++score2;
                        }
                        System.out.println("Score "+score1 +":"+score2);
                        break;
                    }
            }
        }
    }
}
