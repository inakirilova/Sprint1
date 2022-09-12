package com.example.chessboard;

import com.example.CustomScanner;

import java.util.Arrays;

/**
 * Class in which the
 * chessboard is created.
 */

public class Board {

    /**
     *A method that creates the chessboard.
     * @return - board.
     */

    public static String[][] createBoard() {
        int Size = CustomScanner.getNextInt("Enter the size of the chess board: ");
        String[][] board = new String[Size][Size];
        boolean isWhite = false;
        for(int y = 0; y < board.length; y++) {
            isWhite = !isWhite;
            for(int x = 0; x < board[y].length; x++) {
                if(isWhite) {
                    board[y][x] = "W";
                }
                if(!isWhite) {
                    board[y][x] = "B";
                }
                isWhite = !isWhite;
            }
        }
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        return board;
    }
}