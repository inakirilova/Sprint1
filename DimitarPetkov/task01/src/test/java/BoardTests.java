import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import processing.Board;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTests {
    String[][] newBoard = Board.boardCreate(new int[]{2, 3});
    String[][] mockBoard = new String[][] {{"*", " ", "*"},
                                           {" ", "*", " "}};

    @Test
    @DisplayName("To confirm the board is created correctly.")
    public void boardCreateBordersTest() {
        assertAll(
                () -> assertEquals(2, newBoard.length),
                () -> assertEquals(3, newBoard[0].length)
        );
    }

    @Test
    @DisplayName("To confirm the correct filling of the board. ")
    public void boardCreateCellsTest() {
        assertAll(
                () -> assertArrayEquals(mockBoard, newBoard)
        );
    }


    @Test
    @DisplayName("To throw exception for invalid params. ")
    public void testIncorrectData() {
    assertThrows(NegativeArraySizeException.class, () -> Board.boardCreate(new int[]{-4, 3}));
    assertThrows(NegativeArraySizeException.class, () -> Board.boardCreate(new int[]{4, -3}));
    }
}