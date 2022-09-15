
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import validator.Validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ValidatorTests {

    @Test
    @DisplayName("Positive test for valid input -> positive integer")
    public void isValidMethodCorrectInput() {
        assertTrue(Validator.isValidInt("5"));
    }

    @Test
    @DisplayName("Negative tests for invalid input")
    public void isValidMethodIncorrectInput() {
        assertAll(
                () -> assertFalse(Validator.isValidInt("5.28")),
                () -> assertFalse(Validator.isValidInt("-5")),
                () -> assertFalse(Validator.isValidInt("0")),
                () -> assertFalse(Validator.isValidInt("")),
                () -> assertFalse(Validator.isValidInt("five"))
        );
    }

}
