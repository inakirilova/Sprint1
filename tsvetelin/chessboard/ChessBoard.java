package com.example.chessboard;

/**
 * 1. Chess board
 * Draw a chessboard with the given dimensions of height and width, according to the principle:
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * The program is launched by calling the main class with parameters.
 */

public class ChessBoard {
    /**
     * A method named main() that represents the entry or starting point for the program.
     * Main method in which are called all other methods.
     * @param args - list from parameters.
     */
    public static void main(String[] args){
      Board.createBoard();
    }
}
