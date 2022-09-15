package maintenance;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import services.FileReader;


import static common.Messages.FILE_PATH;
import static maintenance.ReverseTextFile.reverseTextFile;
import static org.junit.jupiter.api.Assertions.*;
import static services.RequestProcessor.processRequester;

public class ReverseTextFileTest {

    @Test
    @DisplayName("Modify the text file correctly")
    public void processRequesterCorrectStringReplace() {
        processRequester(new String[]{"path", "string"});
        reverseTextFile();

        assertAll(
                () -> assertEquals(new FileReader().fileReader("src/shortText.txt").toString(), new FileReader().fileReader(FILE_PATH).toString()),
                () -> assertTrue(reverseTextFile())
        );
    }
}
