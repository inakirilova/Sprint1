package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import services.ResponseHandler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static services.ResponseHandler.responseHandler;

public class ResponseHandlerTests {
    @Test
    @DisplayName("Returns TRUE for answer 'y', or 'yes', caseInsensitive.")
    public void responseHandlerTrueTest() {
        assertAll(
        () -> assertTrue(responseHandler("y")),
        () -> assertTrue(responseHandler("Y")),
        () -> assertTrue(responseHandler("yes")),
        () -> assertTrue(responseHandler("Yes")),
        () -> assertTrue(responseHandler("YeS")),
        () -> assertTrue(responseHandler("YES"))
        );
    }

    @Test
    @DisplayName("Returns FALSE for answer different then 'y', or 'yes', caseInsensitive.")
    public void responseHandlerTrueFalse() {
        assertAll(
        () -> assertFalse(responseHandler("n")),
        () -> assertFalse(responseHandler("N")),
        () -> assertFalse(responseHandler("yess")),
        () -> assertFalse(responseHandler("*#--@")),
        () -> assertFalse(responseHandler("54"))
        );
    }
}
