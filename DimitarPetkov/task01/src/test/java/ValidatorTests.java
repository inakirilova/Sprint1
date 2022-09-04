import org.junit.Assert;
import org.junit.Test;

public class ValidatorTests {

    @Test
    public void testIsValidIntPositiveIntegerInput() {
        String integerInput = "5";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertTrue(inputValidate);
    }

    @Test
    public void testIsValidIntNegativeIntegerInput() {
        String integerInput = "-5";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertFalse(inputValidate);
    }

    @Test
    public void testIsValidIntZeroInput() {
        String integerInput = "0";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertFalse(inputValidate);
    }

    @Test
    public void testIsValidIntEmptyInput() {
        String integerInput = "";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertFalse(inputValidate);
    }

    @Test
    public void testIsValidIntFloatingPointInput() {
        String integerInput = "5.28";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertFalse(inputValidate);
    }

    @Test
    public void testIsValidIntStringInput() {
        String integerInput = "five";
        boolean inputValidate = Validator.isValidInt(integerInput);
        Assert.assertFalse(inputValidate);
    }
}
