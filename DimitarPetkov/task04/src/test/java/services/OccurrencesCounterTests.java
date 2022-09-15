package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static common.Messages.FILE_PATH;
import static org.junit.jupiter.api.Assertions.*;
import static services.OccurrencesCounter.occurrencesCount;

public class OccurrencesCounterTests {

    @Test
    @DisplayName("Count the occurrences of the given string in the text")
    public void occurrencesCountCorrectMessageReturn() {

        assertEquals("String path is found 2 times in the given text.",
                        occurrencesCount(new FileReader().fileReader(FILE_PATH), new String[]{"path"}).toString());
        assertEquals("String string is found 6 times in the given text.",
                occurrencesCount(new FileReader().fileReader(FILE_PATH), new String[]{"string"}).toString());
        assertEquals("String wordThatNotExist is found 0 times in the given text.",
                occurrencesCount(new FileReader().fileReader(FILE_PATH), new String[]{"wordThatNotExist"}).toString());

    }
}
