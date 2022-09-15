package maintenance;

import services.FileReader;
import static services.FileWriter.fileWriter;

public class ReverseTextFile {

    public static boolean reverseTextFile() {
            try {
            fileWriter(new FileReader().fileReader("src/shortText.txt"));
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
