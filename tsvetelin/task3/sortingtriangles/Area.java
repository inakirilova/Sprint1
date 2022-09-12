package com.example.sortingtriangles;

import com.example.CustomScanner;

import static com.example.sortingtriangles.Sorting.traingles;

/**
 * A Class, in which is the method for calculation area of triangles.
 */

public class Area {

    /**
     * The method for calculation area of triangles.
     * @return area of triangles.
     */

    public static float getArea() {

        String name = CustomScanner.getNextString("Enter the name of a triangle: ");
        float sideA = CustomScanner.getNextFloat("Enter first side length: ");
        float sideB = CustomScanner.getNextFloat("Enter second side length: ");
        float sideC = CustomScanner.getNextFloat("Enter third side length: ");

        float semiPerimeter = (sideA + sideB + sideC) / 2;
        float area = (float) Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        System.out.print(area);

        traingles.put(name, area);

        return area;
    }
}
