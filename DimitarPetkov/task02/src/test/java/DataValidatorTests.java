import org.junit.Assert;
import org.junit.Test;

public class DataValidatorTests {

    //positive test for floating point number as a given triangle side
    @Test
    public void testValidFloatTypeForTrianglesSides() {
        String input = "2.5";
        Assert.assertTrue(DataValidator.isValidNumber(input));
    }

    //positive test for integer as a given triangle side
    @Test
    public void testValidIntegerTypeForTrianglesSides() {
        String input = "5";
        Assert.assertTrue(DataValidator.isValidNumber(input));
    }

    //negative test for zero as a given triangle side
    @Test
    public void testInvalidNumberZeroForTrianglesSides() {
        String input = "0";
        Assert.assertFalse(DataValidator.isValidNumber(input));
    }

    //negative test for negative number as a given triangle side
    @Test
    public void testInvalidNegativeNumberForTrianglesSides() {
        String input = "-7.5";
        Assert.assertFalse(DataValidator.isValidNumber(input));
    }

    //negative test for String as a given triangle side
    @Test
    public void testInvalidStringTypeForTrianglesSides() {
        String input = "four";
        Assert.assertFalse(DataValidator.isValidNumber(input));
    }
}
