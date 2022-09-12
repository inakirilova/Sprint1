package com.example.fileparser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class WritingTest {

    /**
     * A test for write() method,
     * where the goal is
     * to check the replacement
     * phrase or word.
     */

    @Test
    void write() throws IOException {
        String expected = Writing.write();
        String actual = Writing.write();
        Assertions.assertEquals(expected, actual);
    }
}