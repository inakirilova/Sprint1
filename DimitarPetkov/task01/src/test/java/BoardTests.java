import org.junit.Assert;
import org.junit.Test;

public class BoardTests {
    String[][] newBoard = Board.boardCreate(2, 3);

    @Test
    public void testBoardBorders() {
        Assert.assertEquals(2, newBoard.length);
        Assert.assertEquals(3, newBoard[0].length);
    }

    @Test
    public void testBoardCellsFirstRow() {
        Assert.assertEquals("*", newBoard[0][0]);
        Assert.assertEquals(" ", newBoard[0][1]);
        Assert.assertEquals("*", newBoard[0][2]);
    }

    @Test
    public void testBoardCellsSecondRow() {
        Assert.assertEquals(" ", newBoard[1][0]);
        Assert.assertEquals("*", newBoard[1][1]);
        Assert.assertEquals(" ", newBoard[1][2]);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testIncorrectData() {
    String[][] newBoardOne = Board.boardCreate(-4, 3);
    Assert.assertEquals(-4, newBoardOne.length);
    }
}