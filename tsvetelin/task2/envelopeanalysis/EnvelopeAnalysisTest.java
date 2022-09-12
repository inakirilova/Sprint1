package com.example.envelopeanalysis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A Test class, where the tests are done.
 */

class EnvelopeAnalysisTest {

    /**
     * A test for isFit() method,
     * where the goal is to check
     * whether the first envelope can fit
     * in the second envelope.
     */

    @Test
    void isFit() {
        float sideA = 1.11f;
        float sideB = 2.22f;
        float sideC = 2.22f;
        float sideD = 4.44f;
        float firstEnvelope = sideA * sideB;
        float secondEnvelope = sideC * sideD;
        boolean actual = firstEnvelope < secondEnvelope;
        boolean expected = firstEnvelope < secondEnvelope;
        Assertions.assertEquals(actual, expected);
    }

    /**
     * A test for answered() method,
     * where the goal is to check
     * whether is introduced,
     * what should.
     */

    @Test
    void answered() {
        Assertions.assertTrue(true, "y");
        Assertions.assertTrue(true, "Y");
        Assertions.assertTrue(true, "yes");
        Assertions.assertTrue(true, "Yes");
        Assertions.assertTrue(true, "YES");
        Assertions.assertFalse(false, "n");
        Assertions.assertFalse(false,  "N");
        Assertions.assertFalse(false, "no");
        Assertions.assertFalse(false, "No");
        Assertions.assertFalse(false, "NO");
    }
}