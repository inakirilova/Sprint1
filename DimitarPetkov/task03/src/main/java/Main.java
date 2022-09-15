import services.TrianglesMapping;

import java.util.*;

import static services.SortTriangles.sortTriangles;
import static view.PrintSortedTriangles.printSortedTriangles;


public class Main {

    public static void main(String[] args) {

        Map<String, Float> unsortedTriangles = TrianglesMapping.trianglesMap();
        printSortedTriangles(sortTriangles(unsortedTriangles));
    }
}
