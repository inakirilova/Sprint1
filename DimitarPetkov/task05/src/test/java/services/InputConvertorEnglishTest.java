package services;

import org.junit.Assert;
import org.junit.Test;

import static services.InputConverterEnglish.numberTextConverterEN;

public class InputConvertorEnglishTest {
    @Test
    public void BulgarianValidInput() {
        Assert.assertEquals("one", numberTextConverterEN("1"));
        Assert.assertEquals("zero", numberTextConverterEN("0"));
        Assert.assertEquals("one thousand", numberTextConverterEN("1000"));
        Assert.assertEquals("one thousand one", numberTextConverterEN("1001"));
        Assert.assertEquals("twelve thousand fifty two", numberTextConverterEN("12052"));
        Assert.assertEquals("twelve million five", numberTextConverterEN("12000005"));
    }

    @Test (expected = NumberFormatException.class)
    public void invalidInputThrow() {
        Assert.assertEquals("string", numberTextConverterEN("string"));
    }
}
