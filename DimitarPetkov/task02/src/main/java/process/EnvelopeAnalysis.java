package process;

import common.ConstantMessages;

public class EnvelopeAnalysis {

    public static String compareEnvelopes(float xOne, float yOne,
                                          float xTwo, float yTwo) {

        if (Math.max(xOne, yOne) > Math.max(xTwo, yTwo)
                && Math.min(xOne, yOne) > Math.min(xTwo, yTwo)) {
            return ConstantMessages.FIRST_ENVELOPE_BIGGER;
        } else if (Math.max(xOne, yOne) < Math.max(xTwo, yTwo)
                && Math.min(xOne, yOne) < Math.min(xTwo, yTwo)) {
            return ConstantMessages.SECOND_ENVELOPE_BIGGER;
        } else {
            return ConstantMessages.ENVELOPES_DO_NOT_FIT;
        }
    }
}
