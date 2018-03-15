package tictactoe;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        do {
            TicTacToeViews.menuView();
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
            }

        } while (answer != 0);


    }

    public static void startGame(Scanner scanner) {
        char cross = 'X';
        char circle = 'O';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i =0;
        do {
            TicTacToeViews.boardView(board);
            int position = askForPosition(scanner, board);
            mark(currentSign, board, position);
            currentSign = currentSign == 'X' ? circle : cross;
            i++;
        }while (i < 9 && !gameFisnished(board));
        TicTacToeViews.boardView(board);
        System.out.println("End of game");
        if (!gameFisnished(board)) {
            System.out.println("Draw");
        }else {
            TicTacToeViews.loserEndGame (currentSign);
            System.out.println("And the looser is " + currentSign);
        }
    }

    private static boolean gameFisnished(char[] board) {
               return isFirstDiagonalEqual (board) ||
                isSecondDiagonalEqual (board) ||
                isAnyVerticalEqual(board)||
         isAnyHorizontalEqual(board);
    }

    private static boolean isAnyHorizontalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while (!result && i < 3) {
            result = eqals(board, i * 3, i * 3 + 1, i * 3 + 2);
            i++;
        }
        return false;
    }

    private static boolean isAnyVerticalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while (!result && i < 3) {
            result = eqals(board, i, i+3, i+6);
            i++;
        }
        return false;
    }

    private static boolean isSecondDiagonalEqual(char[] board) {
        return eqals(board, 2,4,6);
    }

    private static boolean isFirstDiagonalEqual(char[] board) {

        return eqals(board,0, 4, 8);
        }

    private static void mark(char currentSign, char[] board, int position) {
        board[position] = currentSign;
    }
    private static boolean eqals(char[] board, int i1, int i2, int i3) {
        return board [i1] == board [i2] & board [i1] == board [i3];
    }


    public static int askForPosition (Scanner scanner, char[] board) {
        int position;
    do {
         position = scanner.nextInt();
        if (!isValidPosition(position, board)) {
            System.out.println("Invalid value. Try again");

        }
    }while (!isValidPosition(position, board));
    return position -1;
    }

    private static boolean isValidPosition(int position, char[] board) {
        return  ((position >= 1 && position <=9) && board[position - 1] != 'X' && board[position -1] != 'O' );

    }
}
