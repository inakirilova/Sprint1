package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import static services.InputRequester.isValidRequest;

public class InputRequesterTests {

    @Test
    @DisplayName("Returns TRUE for valid input.")
    public void isValidRequestTrue(){
        assertAll(
                () -> assertTrue(isValidRequest("string path")),
                () -> assertTrue(isValidRequest("  string    path  ")),
                () -> assertTrue(isValidRequest("string"))
        );
    }

    @Test
    @DisplayName("Returns TRUE for valid input.")
    public void isValidRequestFalse(){
        assertAll(
                () -> assertFalse(isValidRequest("string path path")),
                () -> assertFalse(isValidRequest("23 fiftyFive lemon grass"))
        );
    }
}
