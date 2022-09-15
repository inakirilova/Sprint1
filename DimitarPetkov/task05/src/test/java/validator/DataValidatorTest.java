package validator;

import org.junit.Assert;
import org.junit.Test;

import static validator.DataValidator.inputDataValidator;

public class DataValidatorTest {

    @Test
    public void validateTrue() {
        Assert.assertTrue(inputDataValidator("124578"));
        Assert.assertTrue(inputDataValidator("0"));
        Assert.assertTrue(inputDataValidator("9223372036854775807"));
    }

    @Test
    public void validateFalse() {
        Assert.assertFalse(inputDataValidator("string"));
        Assert.assertFalse(inputDataValidator("0123456"));
        Assert.assertFalse(inputDataValidator("-5"));
        Assert.assertFalse(inputDataValidator("9223372036854775808"));
    }

}
