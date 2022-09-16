package services;

import org.junit.Assert;
import org.junit.Test;

import static services.InputRequest.inputRequester;
import static services.InputRequest.languageSeparator;

public class InputRequestTest {

    @Test
    public void languageSeparatorValidInput() {
        Assert.assertEquals("двеста и петнадесет", languageSeparator("bg", "215"));
        Assert.assertEquals("two hundred fifteen", languageSeparator("en", "215"));
        Assert.assertEquals("five", languageSeparator("", "5"));
    }
}
