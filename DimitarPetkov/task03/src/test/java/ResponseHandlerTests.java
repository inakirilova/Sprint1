import org.junit.Assert;
import org.junit.Test;

public class ResponseHandlerTests {
    @Test
    public void testResponseToContinueReturnTrue() {
        Assert.assertTrue(ResponseHandler.responseHandler("y"));
        Assert.assertTrue(ResponseHandler.responseHandler("Y"));
        Assert.assertTrue(ResponseHandler.responseHandler("yes"));
        Assert.assertTrue(ResponseHandler.responseHandler("Yes"));
        Assert.assertTrue(ResponseHandler.responseHandler("YeS"));
        Assert.assertTrue(ResponseHandler.responseHandler("YES"));
    }

    @Test
    public void testResponseToQuitReturnFalse() {
        Assert.assertFalse(ResponseHandler.responseHandler("n"));
        Assert.assertFalse(ResponseHandler.responseHandler("N"));
        Assert.assertFalse(ResponseHandler.responseHandler("yess"));
        Assert.assertFalse(ResponseHandler.responseHandler("*#--@"));
        Assert.assertFalse(ResponseHandler.responseHandler("54"));
    }
}
