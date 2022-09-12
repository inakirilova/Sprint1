package com.example.sortingtriangles;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * A Class, in which is the method for sort
 * triangles in descending order.
 */

public class Sorting {
    protected static final SortedMap<String, Float> traingles = new TreeMap<>();

    /**
     * /**
     * The method where the triangles
     * are arranged in descending order.
     * @param map they are stored in map.
     * @param <K> their key.
     * @param <V> their value.
     */

    public static <K, V extends Comparable<V>> void valueSort(final Map<K, V> map) {
        Comparator<K> valueComparator = (o2, o1) -> {
            int comp = map.get(o1).compareTo(map.get(o2));
            if (comp == 0) {
                return 1;
            } else {
                return comp;
            }
        };
        Map<K, V> sorted = new TreeMap<>(valueComparator);
        sorted.putAll(map);
        System.out.print(sorted);

    }
}
