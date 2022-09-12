package Task1;

import org.junit.jupiter.api.Test;

import static Task1.Printer.drawChessBoard;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        StringBuilder sb = new StringBuilder();
        sb.append("* ").append("\n").append(" *");
        assertAll(
                () ->  assertEquals(sb.toString() ,drawChessBoard(2, 2)),
                () ->  assertEquals("Please give valid height" ,drawChessBoard(-1, 2)));
    }
}