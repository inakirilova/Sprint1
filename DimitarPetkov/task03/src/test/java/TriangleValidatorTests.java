import common.ConstantMessages;
import org.junit.Assert;
import org.junit.Test;

public class TriangleValidatorTests {

    /* Positive test case for isValidNumber method */
    @Test
    public void testValidNumberReturnTrue() {
        Assert.assertTrue(TriangleValidator.isValidNumber("5.2658"));
        Assert.assertTrue(TriangleValidator.isValidNumber("5"));
    }

    /* Negative test case for isValidNumber method */
    @Test
    public void testInvalidNumberReturnFalse() {
        Assert.assertFalse(TriangleValidator.isValidNumber("0"));
        Assert.assertFalse(TriangleValidator.isValidNumber("-5"));
        Assert.assertFalse(TriangleValidator.isValidNumber("string"));
        Assert.assertFalse(TriangleValidator.isValidNumber("**"));
    }

    /* Positive test case for createTriangleSides method */
    @Test
    public void testCreateTriangleSidesValidInputReturnArray() {
        float[] result = TriangleValidator.createTriangleSides(new String[]{"First", "5.6", "4.5", "7"});
        Assert.assertEquals(5.6F, result[0], 0.00);
        Assert.assertEquals(4.5F, result[1], 0.00);
        Assert.assertEquals(7F, result[2], 0.00);
    }

    /* Positive test case for calculateArea method */
    @Test
    public void testCalculateAreaMethodReturnsFloat() {
        float result = TriangleValidator.calculateArea(new String[]{"First", "6", "6", "7"});
        Assert.assertEquals(17.05689F, result, 0.00F);
    }
}
