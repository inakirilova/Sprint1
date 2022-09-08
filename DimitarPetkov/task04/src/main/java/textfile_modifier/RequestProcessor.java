package textfile_modifier;

import java.io.*;
import java.util.Arrays;

import static common.Messages.*;
import static common.Messages.FILE_PATH;

public class RequestProcessor {

    public static void processInputRequest(String input) {

        String[] request = input.split("\s+");
        String toFind = request[0];

        try (FileInputStream fileStreamIn = new FileInputStream(FILE_PATH)) {

            InputStreamReader inputStreamReader = new InputStreamReader(fileStreamIn);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder textConverted = new StringBuilder();

            int counter = 0;
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] stringSearch = currentLine.split("\s+");
                counter += Arrays.stream(stringSearch).filter(s -> s.matches(toFind)).count();

                if (request.length > 1) {
                    textConverted.append(currentLine.replaceAll(toFind, request[1]))
                            .append(System.lineSeparator());
                }
                currentLine = bufferedReader.readLine();
            }
            if (textConverted.isEmpty()) {
                System.out.printf(STRING_COUNT, toFind, counter);
            } else {
                FileOutputStream fileStreamOut = new FileOutputStream(FILE_PATH);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileStreamOut);

                outputStreamWriter.write(textConverted.toString());
                System.out.printf(STRING_REPLACED, toFind, request[1], FILE_PATH);
                outputStreamWriter.close();
            }

            inputStreamReader.close();
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }
}
