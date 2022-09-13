package test;

import main.Task3;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void findArea() {
        double area = Task3.getArea(3, 4, 5, "Ina");
        assertEquals(6.0, area);
    }

    @Test
    void zeroArea() {
        double area = Task3.getArea(1, 2, 3, "Ina");
        assertEquals(0, area);
    }

}