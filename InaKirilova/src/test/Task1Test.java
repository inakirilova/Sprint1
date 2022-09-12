package test;

import main.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    public static final String WHITE_SYMBOL = "w";
    public static final String BLACK_SYMBOL = "b";

    @Test
    public void testBuildChessBoard() {
        String[][] chessBoard = Task1.buildChessBoard(2, 2);
        assertEquals(2, chessBoard.length);
        assertEquals(2, chessBoard[0].length);
        assertEquals(WHITE_SYMBOL, chessBoard[0][0]);
        assertEquals(BLACK_SYMBOL, chessBoard[0][1]);
        assertEquals(WHITE_SYMBOL, chessBoard[1][1]);
        assertEquals(BLACK_SYMBOL, chessBoard[1][0]);
    }

    @Test
    public void testNegativeInput() {
        String[][] chessBoard = Task1.buildChessBoard(-1, 2);
        assertNull(chessBoard);
    }
}