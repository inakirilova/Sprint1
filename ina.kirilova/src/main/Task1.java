package main;

import java.util.*;

public class Task1 {
    public static void draw() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of the board");
        int width = sc.nextInt();

        System.out.print("Enter height of the board");
        int height = sc.nextInt();

        if (height <= 0 || height > 8) {
            if (width <= 0 || width > 8) {
                System.out.print("Enter valid input");
            }
        } else {
            String[][] board = new String[height][width];


            for (int i = 0; i <= board.length - 1; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    if (i % 2 == 0 && j % 2 == 0) {
                        board[i][j] = "w";
                    }
                    if (i % 2 == 0 && j % 2 == 1) {
                        board[i][j] = "b";
                    }
                    if (i % 2 == 1 && j % 2 == 0) {
                        board[i][j] = "b";
                    }
                    if (i % 2 == 1 && j % 2 == 1) {
                        board[i][j] = "w";
                    }
                }
            }
            for (int c = 0; c < board.length; c++) {
                System.out.println(Arrays.toString(board[c]));
            }

        }
    }


    public static void main(String[] args) {
        draw();
    }
}

