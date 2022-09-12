package main;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static final String WHITE_SYMBOL = "w";
    public static final String BLACK_SYMBOL = "b";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int width;
        int height;
        try {
            System.out.print("Enter width of the board");
            width = sc.nextInt();

            System.out.print("Enter height of the board");
            height = sc.nextInt();

        } catch (Exception e) {
            System.out.print("Invalid input!");
            return;
        }

        String[][] board = buildChessBoard(width, height);

        if (board != null) {
            for (String[] row : board) {
                String str = Arrays.toString(row);
                System.out.println(str.replace(", ", ""));
            }
        }
    }


    public static String[][] buildChessBoard(int width, int height) {
        if (width <= 0 || width > 8 || height <= 0 || height > 8) {
            System.out.println("Invalid input!");
            return null;
        }

        String[][] board = new String[height][width];

        for (int i = 0; i <= board.length - 1; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (i % 2 == 0 && j % 2 == 0) {
                    board[i][j] = WHITE_SYMBOL;
                }
                if (i % 2 == 0 && j % 2 == 1) {
                    board[i][j] = BLACK_SYMBOL;
                }
                if (i % 2 == 1 && j % 2 == 0) {
                    board[i][j] = BLACK_SYMBOL;
                }
                if (i % 2 == 1 && j % 2 == 1) {
                    board[i][j] = WHITE_SYMBOL;
                }
            }
        }
        return board;
    }
}

