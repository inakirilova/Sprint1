import common.ConstantMessages;
import org.junit.Assert;
import org.junit.Test;

public class EnvelopeAnalysisTests {
    float OneX;
    float OneY;
    float TwoX;
    float TwoY;

    @Test
    public void testFirstEnvelopeBiggerReturnCorrectMessage() {
        OneX = 5.5F;
        OneY = 8.3F;
        TwoX = 5.4F;
        TwoY = 5.5F;
        String result = EnvelopeAnalysis.compareEnvelopes(OneX, OneY, TwoX, TwoY);
        Assert.assertEquals(ConstantMessages.FIRST_ENVELOPE_BIGGER, result);
    }

    @Test
    public void testSecondEnvelopeBiggerReturnCorrectMessage() {
        OneX = 5.5F;
        OneY = 3.3F;
        TwoX = 5.4F;
        TwoY = 7.5F;
        String result = EnvelopeAnalysis.compareEnvelopes(OneX, OneY, TwoX, TwoY);
        Assert.assertEquals(ConstantMessages.SECOND_ENVELOPE_BIGGER, result);
    }

    @Test
    public void testEnvelopesDoNotFitReturnCorrectMessage() {
        OneX = 12.8F;
        OneY = 2.5F;
        TwoX = 5.4F;
        TwoY = 5.5F;
        String result = EnvelopeAnalysis.compareEnvelopes(OneX, OneY, TwoX, TwoY);
        Assert.assertEquals(ConstantMessages.ENVELOPES_DO_NOT_FIT, result);
    }

}
