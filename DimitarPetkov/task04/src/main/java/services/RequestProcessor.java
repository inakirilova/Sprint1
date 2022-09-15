package services;

import static common.Messages.*;
import static services.OccurrencesCounter.occurrencesCount;
import static services.StringReplacer.stringReplace;

public class RequestProcessor {

    public static String processRequester(String[] request) {
        try {
            FileReader reader = new FileReader();

            switch (request.length) {
                case 1 -> {
                    return occurrencesCount(reader.fileReader(FILE_PATH), request).toString();
                }
                case 2 -> {
                    return stringReplace(reader.fileReader(FILE_PATH), request).toString();
                }
            }
        } catch (Exception ex) {
            return FILE_NOT_FOUND;
        }
        return INPUT_INCORRECT;
    }
}
