package test;

import main.Task3;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void valueSort() {
        double area = Task3.getArea(3, 4, 5, "Ina");
        assertEquals(6.0, area);
    }

}