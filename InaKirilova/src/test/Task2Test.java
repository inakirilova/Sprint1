package test;

import main.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void compare1() {
        boolean compare = Task2.compareEnvelopes("Ina", "Kirilova", 10, 20, 15, 1);
        assertTrue(compare);
    }

    @Test
    void compare2() {
        boolean compare = Task2.compareEnvelopes("Ina", "Kirilova", 10, 15, 20, 20);
        assertTrue(compare);
    }

    @Test
    void compareNegative() {
        boolean compare = Task2.compareEnvelopes("Ina", "Kirilova", 10, 20, 5, 30);
        assertFalse(compare);
    }

}