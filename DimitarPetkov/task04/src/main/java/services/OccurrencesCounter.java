package services;
import java.util.Arrays;

import static common.Messages.STRING_COUNT;

public class OccurrencesCounter {
    public static StringBuilder occurrencesCount(StringBuilder text, String[] request) {

        int counter = 0;
        counter += Arrays
                .stream(text.toString().split("\s+"))
                .filter(s -> s.contains(request[0].trim()))
                .count();

        return new StringBuilder()
                .append(String.format(STRING_COUNT,
                        request[0].trim(),
                        counter));
    }
}
