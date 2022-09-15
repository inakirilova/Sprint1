package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static common.Messages.FILE_PATH;
import static maintenance.ReverseTextFile.reverseTextFile;
import static org.junit.jupiter.api.Assertions.*;
import static services.RequestProcessor.processRequester;

public class ProcessRequesterTest {

    @Test
    @DisplayName("")
    public void processRequesterCorrectCounter(){
        assertAll(
                () -> assertEquals("String string is found 6 times in the given text.",
                        processRequester((new String[]{"string"})))
        );
    }

    @Test
    @DisplayName("Modify the text file correctly")
    public void processRequesterCorrectStringReplace() {
        processRequester(new String[]{"path", "string"});

        assertAll(
                () -> assertEquals(new FileReader().fileReader("src/fileTwo").toString(),
                        new FileReader().fileReader(FILE_PATH).toString()),
                () -> assertTrue(reverseTextFile())
        );
    }

    @Test
    @DisplayName("Redirect to correct method and return message")
    public void processRequesterCorrectMessageReturn(){
        assertAll(
                () -> assertEquals("String string is found 6 times in the given text.",
                        processRequester((new String[]{"string"}))),
                () -> assertEquals("String 'string', has been replaced by 'path', in text file: \n" +
                                "src/shortText_02.txt",
                        processRequester((new String[]{"string", "path"}))),
                () -> assertEquals("String string is found 0 times in the given text.",
                        processRequester((new String[]{"string"}))),
                () -> assertTrue(reverseTextFile())
        );
    }


}
