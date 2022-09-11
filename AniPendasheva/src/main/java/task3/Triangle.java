package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static task3.Main.*;


public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private double perimeter;
    private String name;

    public Triangle(double sideA, double sideB, double sideC, String name) throws Exception {
        if (!isTrianglePossible(sideA, sideB, sideC)) {
            throw new Exception();
        }
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = sideA + sideB + sideC;
        this.area = findArea(sideA, sideB, sideC);
    }

    public static double findArea(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC) / 2;
        double argument = p * (p - sideA) * (p - sideB) * (p - sideC);

        return Math.sqrt(argument) / 4;
    }
    static boolean isTrianglePossible(double sideA, double sideB, double sideC) {
        return !(sideA >= sideB + sideC || sideB >= sideC + sideA || sideC >= sideB + sideA);
    }

    public static void sortByAreaDesc(ArrayList<Triangle> al, Compare comp) {
        for (int j = 0; j < al.size(); j++) {
            Triangle maxEl = al.get(j);
            int indexOfMax = j;

            for (int i = j; i < al.size(); i++) {
                int finalI = i;
                int compareRes = comp.compareTo(al.get(finalI), maxEl);
                if (compareRes > 0) {
                    maxEl = al.get(i);
                    indexOfMax = i;
                }
            }

            if (indexOfMax != j) {
                Collections.swap(al,j,indexOfMax);
            }
        }
    }

    static Compare comp = (Triangle tt1, Triangle tt2) -> {
        double area1 = tt1.getArea();
        double area2 = tt2.getArea();

        if (area1 == area2) {
            return 0;
        }
        if (area1 > area2) {
            return 1;
        } else {
            return -1;
        }
    };

    public static void setTriangle( String a, String b, String c,String name, Scanner scanner) {
        try {
            double sideA = Double.parseDouble(a);
            double sideB = Double.parseDouble(b);
            double sideC = Double.parseDouble(c);
            if (!isTrianglePossible(sideA, sideB, sideC)) {
                System.out.println("Invalid triangle sizes!");
                inputValues(scanner);
            }

            if (!areNumsPositive(sideA, sideB, sideC)) {
                System.out.println("Sizes must be positive!");
                inputValues(scanner);
            }
            Triangle t = new Triangle(sideA, sideB, sideC, name);
            al.add(t);
            continueProgram(scanner);

        } catch (Exception e) {
            System.out.println("Please type in numeric sizes!");
            inputValues( scanner);
        }
    }

    public static boolean areNumsPositive(double size1, double size2, double size3) {
        return !(size1 <= 0 || size2 <= 0 || size3 <= 0);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

}
