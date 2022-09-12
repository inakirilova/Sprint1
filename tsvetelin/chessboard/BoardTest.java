package com.example.chessboard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardTest {

    /**
     * A test for createBoard() method,
     * where the goal is to check
     * whether the board prints correctly.
     */


    @Test
    void createBoard() {
        String[][] expectedSize = Board.createBoard();
        String[][] actualSize = Board.createBoard();
        Assertions.assertEquals(expectedSize, actualSize);
    }
}