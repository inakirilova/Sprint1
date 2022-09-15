package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static common.Messages.FILE_PATH;
import static maintenance.ReverseTextFile.reverseTextFile;
import static org.junit.jupiter.api.Assertions.*;
import static services.OccurrencesCounter.occurrencesCount;
import static services.StringReplacer.stringReplace;

public class StringReplacerTest {

    @Test
    @DisplayName("Replace the given string in the text with the another, and returns message")
    public void stringReplaceCorrectMessageReturn() {

            FileReader reader = new FileReader();

        assertAll(
                () -> assertEquals("String string is found 6 times in the given text.",
                        occurrencesCount(reader.fileReader(FILE_PATH), new String[]{"string"}).toString()),
                () -> assertEquals("String 'string', has been replaced by 'path', in text file: \n" +
                                "src/shortText_02.txt",
                        stringReplace(reader.fileReader(FILE_PATH), new String[]{"string", "path"}).toString()),
                () -> assertEquals("String string is found 0 times in the given text.",
                        occurrencesCount(reader.fileReader(FILE_PATH), new String[]{"string"}).toString()),
                () -> assertTrue(reverseTextFile())
        );
    }
}
