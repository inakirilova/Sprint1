package services;

import static common.Messages.FILE_PATH;
import static common.Messages.STRING_REPLACED;
import static services.FileWriter.fileWriter;

public class StringReplacer {

    public static StringBuilder stringReplace(StringBuilder text, String[] request) {

        fileWriter(new StringBuilder()
                .append(text.toString()
                        .replace(request[0].trim(), request[1].trim())));

        return new StringBuilder()
                .append(String.format(STRING_REPLACED,
                        request[0].trim(),
                        request[1].trim(),
                        FILE_PATH));
    }
}
