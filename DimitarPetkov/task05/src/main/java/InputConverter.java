import data_source.NumberScales;

public class InputConverter {

    public static void numberTextConverter(String input) {
        try {
            long inputNumber = Long.parseLong(input);

            String[] inputArray = input.split("");
            int highestDigit = inputArray.length % 3;
            int scaleTypePrefix = inputArray.length / 3;

            StringBuilder result = new StringBuilder();

            if (highestDigit != 0 || inputArray.length < 3) {
                if (inputArray[0].equals("1") && inputArray.length <= 2) {
                    result
                            .append(NumberScales.singleAndTeen[Integer.parseInt(inputArray[0]
                            .concat(inputArray[1]))]);
                } else {
                    if (inputArray.length > 1 && highestDigit > 1) {
                        result
                                .append(NumberScales.tens[Integer.parseInt(inputArray[0])])
                                .append(" ")
                                .append(NumberScales.singleAndTeen[Integer.parseInt(inputArray[1])])
                                .append(" ");
                    } else {
                        result
                                .append(NumberScales.singleAndTeen[Integer.parseInt(inputArray[0])])
                                .append(" ");
                    }
                }
                if (inputArray.length > 3) {
                    result
                            .append(NumberScales.largeNumbers[scaleTypePrefix + 1])
                            .append(" ");
                } else {
                    System.out.println(result);
                    return;
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
                        result
                                .append(NumberScales.singleAndTeen[hundreds])
                                .append(" ")
                                .append(NumberScales.largeNumbers[1])
                                .append(" ");
                    }
                    if (inputArray[i + 1].equals("1")) {
                        result
                                .append(
                                        NumberScales.singleAndTeen[Integer.parseInt(inputArray[i + 1]
                                        .concat(inputArray[i + 2]))])
                                .append(" ");
                    } else {
                        int tens = Integer.parseInt(inputArray[i + 1]);
                        int ones = Integer.parseInt(inputArray[i + 2]);
                        result.append(NumberScales.tens[tens])
                                .append(" ")
                                .append(NumberScales.singleAndTeen[ones])
                                .append(" ");
                    }
                    if (scaleTypePrefix >= 2) {
                        result
                                .append(NumberScales.largeNumbers[scaleTypePrefix])
                                .append(" ");

                        scaleTypePrefix--;
                    }
                }
            }

            System.out.println(inputNumber + " - " + result);

        } catch (NumberFormatException ex) {
            System.out.println("This is not a number");
        }
    }
}
