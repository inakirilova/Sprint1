package test;

import main.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void draw() {

        String [][] actual = new String[5][5];
        assertEquals(5,actual.length);
        assertEquals(5,actual[0].length);

    }
    public void empty() throws IllegalArgumentException{
        IllegalArgumentException e = new IllegalArgumentException();
        String [][] board = new String[0][0];
        assertEquals(e, board.length);
        assertEquals(e, board[0].length);
    }
    public void invalidSize() throws IllegalArgumentException{
        IllegalArgumentException i = new IllegalArgumentException();
        String [][] actual2 = new String [-1][1];
        String [][] actual3 = new String[1][-1];
        assertAll();{
            assertEquals(i, actual2.length);
            assertEquals(i, actual3[0].length);
        }
    }

    @Test
    void main() {
    }
}