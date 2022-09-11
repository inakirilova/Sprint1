package task5;

import org.junit.jupiter.api.Test;
import task4.FileParser;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NumberWordTest {

    @Test
    void setNumWord() {
        NumberWord nw = new NumberWord();

        assertAll(
                () -> assertEquals("one", nw.setNumWord("1")),
                () -> assertEquals("eleven", nw.setNumWord("11")),
                () -> assertEquals("forty five", nw.setNumWord("45")),
                () -> assertEquals("one hundred forty five", nw.setNumWord("145")),
                () -> assertEquals("one thousand one hundred forty five", nw.setNumWord("1145")),
                () -> assertEquals("one thousand forty five", nw.setNumWord("1045")),
                () -> assertEquals("minus one thousand", nw.setNumWord("-1000")),
                () -> assertEquals("one billion", nw.setNumWord("1000000000")),
                () -> assertEquals("zero", nw.setNumWord("0")),
                () -> assertEquals("one billion one hundred twenty three million four hundred fifty six thousand seven hundred eighty nine", nw.setNumWord("1123456789")),
                () -> assertEquals("two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven", nw.setNumWord(Integer.MAX_VALUE + ""))
        );
    }
}