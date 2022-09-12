package com.example.numberinwords;

/**
 * A class that performs the conversion of numbers to words.
 */

public class Converting {

    /**
     * A method that converts numbers into words.
     * @param number - the number to be converted.
     * @return - the converted number into words.
     */

    public static String convertNumberToWords(int number) {

        //this variable is going to hold string representation of number
        String words = "";

        String[] unitsArray = { "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tensArray = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        if (number == 0) {
            return "zero";
        }
        // We should add minus before conversion if the number is less than 0 ( for negative number)
        if (number < 0) {
            //Converting the number to a string
            String numberString = "" + number;
            // remove minus before the number
            numberString = numberString.substring(1);
            // add minus before the number and Converting the rest of number
            return "minus " + convertNumberToWords(Integer.parseInt(numberString));
        }
        // Here We check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
            words += convertNumberToWords(number / 1000000) + " million ";
            number %= 1000000;
        }
        // Here we are checking if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += convertNumberToWords(number / 1000) + " thousand ";
            number %= 1000;
        }
        // Here we are checking if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += convertNumberToWords(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            // check if number is within unitsArray
            if (number < 20) {
                //fetch the appropriate value from unit array
                words += unitsArray[number];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }
        return words;
    }
}
