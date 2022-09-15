package view;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintSortedTriangles {
    public static void printSortedTriangles(Map<String, Float> sortedMapOfTriangles) {
        DecimalFormat df = new DecimalFormat("#.##");
        AtomicInteger count = new AtomicInteger(1);

        sortedMapOfTriangles.forEach((key, value) -> System.out.printf("%d. [Triangle %s]: %scm\n", count.getAndAdd(1),
                key, df.format(value)));

    }
}
