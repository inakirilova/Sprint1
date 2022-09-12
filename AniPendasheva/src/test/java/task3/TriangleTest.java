package task3;

import org.junit.jupiter.api.Test;
import task2.Envelope;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void findArea() {
        assertAll(
                () -> assertEquals(1.5, Triangle.findArea(3, 4, 5), "Area of triangle with sides 3,4,5"),
                () -> assertEquals(3.6742346141747673, Triangle.findArea(5, 6, 7), "Area of triangle with sides 5,6,7"),
                () -> assertEquals(14.696938456699069, Triangle.findArea(10, 12, 14), "Area of triangle with sides 10,12,14"),
                () -> assertEquals(14.696938456699069, Triangle.findArea(10.0, 12.0, 14.0), "Area of triangle with sides 10.0,12.0,14.0")
        );
    }

    @Test
    void isTrianglePossible() {
        assertAll(
                () -> assertEquals(true, Triangle.isTrianglePossible(3, 4, 5), "Is triangle with 3,4,5 possible"),
                () -> assertEquals(true, Triangle.isTrianglePossible(5, 6, 7), "Is triangle with 5,6,7 possible"),
                () -> assertEquals(true, Triangle.isTrianglePossible(5.5, 6.1, 7.7), "Is triangle with 5,6,7 possible"),
                () -> assertEquals(false, Triangle.isTrianglePossible(0, 0, 0), "Is triangle with 0,0,0 possible"),
                () -> assertEquals(true, Triangle.isTrianglePossible(10, 12, 14), "Is triangle with 10,12,14 possible"),
                () -> assertEquals(false, Triangle.isTrianglePossible(1, 2, 14), "Is triangle with 1,2,14 possible")
        );
    }

    @Test
    void areNumsPositive() {
        assertAll(
                () -> assertEquals(true, Triangle.areNumsPositive(3, 4, 5), "Are 3,4,5 positive"),
                () -> assertEquals(true, Triangle.areNumsPositive(3.0, 4.0, 5.5), "Are 3,4,5 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(0, 0, 0), "Are 0,0,0 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(-3, 4, 5), "Are -3,4,5 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(3, -4, 5), "Are 3,-4,5 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(3, 4, -5), "Are 3,4,-5 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(-3, -4, -5), "Are -3,-4,-5 positive"),
                () -> assertEquals(false, Triangle.areNumsPositive(-3.5, -4.0, -5f), "Are -3,-4,-5 positive")
        );
    }
}