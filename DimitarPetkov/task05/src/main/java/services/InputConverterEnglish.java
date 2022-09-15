package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static data_source.NumberScales.*;

public class InputConverterEnglish {

    public static String numberTextConverterEN(String input)  {

        String[] inputArray = input.split("");
        int highestDigit = inputArray.length % 3;
        int scaleTypePrefix = inputArray.length / 3;

        List<String> finalText = new ArrayList<>();
        String delimiter = " ";

        if (highestDigit != 0 || inputArray.length < 3) {
            if (inputArray[0].equals("1") && highestDigit > 1) {
                finalText.add(singleAndTeen[Integer.parseInt(inputArray[0]
                        .concat(inputArray[1]))]);

            } else {
                if (highestDigit > 1) {
                    finalText.add(tens[Integer.parseInt(inputArray[0])]);
                    finalText.add(singleAndTeen[Integer.parseInt(inputArray[1])]);

                } else if (Integer.parseInt(inputArray[0]) == 0){
                    finalText.add("zero");

                } else {
                    finalText.add(singleAndTeen[Integer.parseInt(inputArray[0])]);
                }
            }
            if (inputArray.length > 3) {
                finalText.add(largeNumbers[scaleTypePrefix + 1]);

            } else {
                return finalText.stream().map(Objects::toString)
                        .collect(Collectors.joining(delimiter));
            }
        }

        for (int i = highestDigit; i <= inputArray.length - 3; i+= 3) {
            if (inputArray[i].equals("0")
                    && inputArray[i + 1].equals("0")
                    && inputArray[i + 2].equals("0")) {
                scaleTypePrefix--;
            } else {
                int hundreds = Integer.parseInt(inputArray[i]);
                if (hundreds != 0) {
                    finalText.add(singleAndTeen[hundreds]);
                    finalText.add(largeNumbers[1]);

                }
                if (inputArray[i + 1].equals("1")) {
                    finalText.add(singleAndTeen[Integer.parseInt(inputArray[i + 1]
                            .concat(inputArray[i + 2]))]);
                } else {
                    int ten = Integer.parseInt(inputArray[i + 1]);
                    int ones = Integer.parseInt(inputArray[i + 2]);
                    if (ten > 1 ) {
                        finalText.add(tens[ten]);
                    }
                    if (ones > 0) {
                        finalText.add(singleAndTeen[ones]);

                    }

                }
                if (scaleTypePrefix >= 2) {
                    finalText.add(largeNumbers[scaleTypePrefix]);

                    scaleTypePrefix--;
                }
            }
        }
        return finalText.stream().map(Objects::toString)
                .collect(Collectors.joining(delimiter));
    }
}

