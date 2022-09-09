package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void compare() {
        double side1 = 4;
        double side2 = 3;
        String message = "first is bigger";
        assertEquals(message, compare(side1,side2));
    }

    @Test
    void contcomp() {
        String answer = "yes";
        assertEquals("yes", answer);
    }

    @Test
    void main() {
    }
}