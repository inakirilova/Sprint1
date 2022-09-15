package services;

import org.junit.Assert;
import org.junit.Test;

import static services.InputConverterBulgarian.numberTextConverterBG;

public class InputConvertorBulgarianTest {
    @Test
    public void BulgarianValidInput() {
        Assert.assertEquals("едно", numberTextConverterBG("1"));
        Assert.assertEquals("нула", numberTextConverterBG("0"));
        Assert.assertEquals("хиляда", numberTextConverterBG("1000"));
        Assert.assertEquals("хиляда и едно", numberTextConverterBG("1001"));
        Assert.assertEquals("дванадесет хиляди петдесет и две", numberTextConverterBG("12052"));
        Assert.assertEquals("дванадесет милиона и пет", numberTextConverterBG("12000005"));
    }

    @Test (expected = NumberFormatException.class)
    public void invalidInputThrow() {
        Assert.assertEquals("string", numberTextConverterBG("string"));
    }
}
