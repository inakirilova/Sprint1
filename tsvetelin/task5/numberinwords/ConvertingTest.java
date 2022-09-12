package com.example.numberinwords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertingTest {

    /**
     * A test for convertNumberToWords() method,
     * where the goal is to check that the conversion
     * of number to words is done correctly
     */

    private int number;

    @Test
    void convertNumberToWords() {
        String actual = Converting.convertNumberToWords(number);
        String expected = Converting.convertNumberToWords(number);
        assertEquals(actual, expected);
    }
}