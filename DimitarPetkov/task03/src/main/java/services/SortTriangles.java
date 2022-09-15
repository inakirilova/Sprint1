package services;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortTriangles {

    public static Map<String, Float> sortTriangles(Map<String, Float> unsortedTriangles) {
        Map<String,Float> sortedTriangles = new LinkedHashMap<>();
                unsortedTriangles.entrySet()
                .stream()
                .sorted(
                        (left, right) -> {
                            int result = right.getValue().compareTo(left.getValue());
                            if (result == 0) {
                                result = left.getKey().compareTo(right.getKey());
                            }
                            return result;
                        }
                ).forEachOrdered(x -> sortedTriangles.put(x.getKey(), x.getValue()));
        return sortedTriangles;
    }
}
