package services;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import static common.Messages.*;

public class FileWriter {

    public static boolean fileWriter(StringBuilder sb) {

        try {
            FileOutputStream fileStreamOut = new FileOutputStream(FILE_PATH);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileStreamOut);

            outputStreamWriter.write(sb.toString());
            outputStreamWriter.close();
            return true;
        } catch (Exception ex) {
            return false;
        }

    }
}
