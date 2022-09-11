package task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileParser {
    public static int countWordInFile(Scanner file, String strToCount) {
        int count = 0;

        while (file.hasNext()) {
            String wordToCompare = file.next();
            if (strToCount.equalsIgnoreCase(wordToCompare)) {
                count++;
            }
        }

        return count;
    }

    public static boolean replaceStrInFile( String path,Scanner file,String strToFind, String strToReplace) throws IOException {
        StringBuilder sb = new StringBuilder();

        while (file.hasNextLine()) {
            sb.append(file.nextLine()).append(System.lineSeparator());
        }
        String fileContents = sb.toString();
        System.out.println("Contents of the file: "+fileContents);

        file.close();

          String fileContentNew = fileContents.replaceAll(strToFind, strToReplace);
            FileWriter writer = new FileWriter(path);
            System.out.println("new data: " + fileContentNew);
            writer.append(fileContentNew);
            writer.flush();

            return !fileContentNew.equals(fileContents);
        }
}
