package process;

import org.junit.Test;

import static common.ConstantMessages.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static process.EnvelopeAnalysis.compareEnvelopes;

public class EnvelopeAnalysisTests {

    @Test
    public void testSecondEnvelopeBiggerReturnCorrectMessage() {
        assertAll(
        () -> assertEquals(SECOND_ENVELOPE_BIGGER,
                compareEnvelopes(5.5F, 3.3F, 5.4F, 7.5F)),
        () -> assertEquals(FIRST_ENVELOPE_BIGGER,
                compareEnvelopes(5.5F, 8.3F, 5.4F, 5.5F)),
        () -> assertEquals(ENVELOPES_DO_NOT_FIT,
                compareEnvelopes(12.8F, 2.5F, 5.4F, 5.5F))
        );
    }

}
