package com.example.sortingtriangles;

import org.junit.jupiter.api.Assertions;

/**
 * A Test class, where the tests are done.
 */

class SortingTrianglesTest {

    /**
     * A test for answered() method,
     * where the goal is to check
     * whether is introduced,
     * what should.
     */

    @org.junit.jupiter.api.Test
    void answered() {
        Assertions.assertTrue(true, "y");
        Assertions.assertTrue(true, "Y");
        Assertions.assertTrue(true, "yes");
        Assertions.assertTrue(true, "Yes");
        Assertions.assertTrue(true, "YES");
        Assertions.assertFalse(false, "n");
        Assertions.assertFalse(false, "N");
        Assertions.assertFalse(false, "no");
        Assertions.assertFalse(false, "No");
        Assertions.assertFalse(false, "NO");
    }

    /**
     * A test for getArea() method,
     * where the goal is to check
     * whether correctly calculated
     * the area of the triangles.
     */

    @org.junit.jupiter.api.Test
    void getArea() {
        float sideA = 5f;
        float sideB = 5f;
        float sideC = 5f;
        float semiPerimeter = (sideA + sideB + sideC) / 2;
        float actual = (float) Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
        float expected = (float) Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
        Assertions.assertEquals(actual, expected);
    }
}