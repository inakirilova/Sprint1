package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task5;

public class Task5Test {

    String[] numbers = {"Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
            "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
            "Thirty ","Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine",
            "Forty ","Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine",
    };

    @Test
    public void test() {
        for (int i = 1; i <= 49; i++) {
            String number = Task5.numberConverters(String.valueOf(i));
            Assertions.assertEquals(numbers[i].trim(), number.trim());
        }
    }
}
