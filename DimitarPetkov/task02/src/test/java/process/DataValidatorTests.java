package process;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static process.DataValidator.isValidNumber;

public class DataValidatorTests {


    @Test
    @DisplayName("Valid input return TRUE")
    public void testValidFloatTypeForTrianglesSides() {
        assertAll(
        () -> assertTrue(isValidNumber("2.5")),
        () -> assertTrue(isValidNumber("5"))
        );
    }

    @Test
    @DisplayName("Invalid input return FALSE")
    public void testInvalidNumberZeroForTrianglesSides() {
        assertAll(
        () -> assertFalse(isValidNumber("0")),
        () -> assertFalse(isValidNumber("-7.5")),
        () -> assertFalse(isValidNumber("four"))
        );
    }

}
