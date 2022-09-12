package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task3 {


    private static <K, V extends Comparable<V>> Comparator<Double> getComparator() {
        return new Comparator<Double>() {
            @Override
            public int compare(Double o2, Double o1) {
                int comp = o1.compareTo(o2);
                if (comp == 0) {
                    return 1;
                } else {
                    return comp;
                }
            }
        };
    }

    public static double getArea(double side1, double side2, double side3, String name) {

        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        System.out.println(name + " - " + area);

        return area;
    }

    private static boolean shouldContinueProgram(String answer) {
        boolean continueProgram;
        switch (answer) {
            case "yes", "YES", "Yes", "y", "Y": {
                continueProgram = true;
                break;
            }
            case "no", "No", "NO", "n", "N": {
                continueProgram = false;
                break;
            }
            default:
                continueProgram = false;
                System.out.print("Invalid option!");
                break;
        }
        return continueProgram;
    }


    public static void main(String[] arguments) {
        Map<Double, String> triangles = new TreeMap<>(getComparator());

        Scanner sc = new Scanner(System.in);
        String infoTriangle;

        boolean continueProgram;
        do {
            System.out.print("Enter name and sides");
            infoTriangle = sc.next();
            String[] info = infoTriangle.split(",");

            String name = info[0].trim();
            double side1;
            double side2;
            double side3;
            try {
                side1 = Double.parseDouble(info[1].trim());
                side2 = Double.parseDouble(info[2].trim());
                side3 = Double.parseDouble(info[3].trim());
                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new NumberFormatException("Negative number!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
                return;
            }
            Double area = getArea(side1, side2, side3, name);

            triangles.put(area, name);

            System.out.print("Do you want to continue? Yes/No");
            String answer = sc.next();

            continueProgram = shouldContinueProgram(answer);
            System.out.println();

        } while (continueProgram);

        printTriangles(triangles);


    }

    public static Map<Double, String> printTriangles(Map<Double, String> sortedTriangles) {
        System.out.println("=============Triangle List==============");
        for (Map.Entry<Double, String> triangle : sortedTriangles.entrySet()) {
            System.out.println("[" + triangle.getValue() + "]: " + BigDecimal.valueOf(triangle.getKey()).setScale(2, RoundingMode.DOWN));
        }
        return sortedTriangles;
    }
}
