package com.example.fileparser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ReadingTest {

    /**
     * A test for read() method,
     * where the goal is to check the count
     * of the word or phrase we search.
     */

    @Test
    void read() throws IOException {
        int expectedCount = Reading.read();
        int actualCount = Reading.read();
        Assertions.assertEquals(expectedCount, actualCount);
    }
}