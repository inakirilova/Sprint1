package validator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import validator.TriangleValidator;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static validator.TriangleValidator.*;

public class TriangleValidatorTests {

    @Test
    @DisplayName("Return TRUE for positive number input.")
    public void isValidNumberTrue() {
        assertAll(
        () -> assertTrue(isValidNumber("5.2658")),
        () -> assertTrue(isValidNumber("5"))
        );
    }

    @Test
    @DisplayName("Return FALSE for negative number input, or NaN.")
    public void isValidNumberFalse() {
        assertAll(
        () -> assertFalse(isValidNumber("0")),
        () -> assertFalse(isValidNumber("-5")),
        () -> assertFalse(isValidNumber("string")),
        () -> assertFalse(isValidNumber("**"))
        );
    }

    @Test
    @DisplayName("Returns correct float array of triangle sides.")
    public void createTriangleSidesMethod() {
    float[] triangleSides = createTriangleSides(new String[]{"First", "3.4", "4.5", "5.6"});
    float[] mockSides = new float[]{3.4f, 4.5f, 5.6f};

        assertAll(
                () -> Assertions.assertArrayEquals(mockSides, triangleSides)
        );
    }

    @Test
    @DisplayName("Calculate the area, and returns floating point number. ")
    public void calculateAreaMethod() {
        String[] mockSides = new String[] {"3.4", "4.5", "5.6"};
        assertAll(
                () -> assertEquals(7.65F, calculateArea(new String[] {"First", "3.4", "4.5", "5.6"}), 0.001)
        );
    }
}
