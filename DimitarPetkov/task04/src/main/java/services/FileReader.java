package services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReader {

    public StringBuilder fileReader(String path) {

        try {
            FileInputStream fileStreamIn = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileStreamIn);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder textFromFile = new StringBuilder();
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                textFromFile.append(currentLine).append(System.lineSeparator());
                currentLine = bufferedReader.readLine();
            }
            return textFromFile;
        } catch (Exception ignore) {
            return null;
        }

    }

}
