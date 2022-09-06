package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    private static ArrayList<Triangle> triangles = new ArrayList<>();
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        toDescendingOrderByArea();
        printAllTriangles();

        while (true) {
            System.out.println("Do you want to create a triangle?");
            String option = cin.next();

            if (option.equals("y") || option.equals("yes") || option.equals("Y") || option.equals("YES")) {
                System.out.println("Name for the triangle: ");
                String name = cin.next();

                System.out.println("Length for side A: ");
                float sideA = cin.nextFloat();

                System.out.println("Length for side B: ");
                float sideB = cin.nextFloat();

                System.out.println("Length for side C: ");
                float sideC = cin.nextFloat();

                if (Triangle.isTriangle(sideA, sideB, sideC)) {
                    triangles.add(new Triangle(name, sideA, sideB, sideC));
                } else {
                    System.out.println("Entered lengths do not form a triangle.");
                }
            } else {
                toDescendingOrderByArea();
                printAllTriangles();
                break;
            }
        }
    }

    private static void printAllTriangles() {
        if (triangles.size() == 0) {
            System.out.println("There are no existing triangles to show.");
            return;
        } else {
            for (Triangle currentTriangle : triangles) {
                System.out.println("Triangle " + currentTriangle.getName() + " has area " + currentTriangle.getArea());
            }
        }
    }

    private static void toDescendingOrderByArea() {
        for (int i = 0; i < triangles.size(); i++) {
            for (int j = i; j < triangles.size(); j++) {
                if (triangles.get(i).getArea() < triangles.get(j).getArea()) {
                    Collections.swap(triangles, i, j);
                }
            }
        }
    }
}
