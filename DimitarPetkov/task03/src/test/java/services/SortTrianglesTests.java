package services;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static services.SortTriangles.sortTriangles;

public class SortTrianglesTests {

    @Test
    @DisplayName("Returns sorted map of the triangles, area in descending order, names in ascending. ")
    public void sortTrianglesMethod(){
        Map<String,Float> unsortedTriangles = Map.of("first", 6F, "second", 7.65F, "third", 6.6F);
        Map<String,Float> sortedTriangles = Map.of("second", 7.65F, "third", 6.6F, "first", 6F);
        assertEquals(sortedTriangles, sortTriangles(unsortedTriangles));
    }
}
