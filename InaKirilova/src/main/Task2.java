package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2 {
    public static boolean compareEnvelopes(String name1, String name2, float a, float b, float c, float d) {
        boolean isConditionMet = false;
        String bigger = "";
        String smaller = "";
        if ((a < c && b < d) || (a < d && b < c)) {
            isConditionMet = true;
            smaller = name1;
            bigger = name2;
        } else if ((a > c && b > d) || (a > d && b > c)) {
            isConditionMet = true;
            smaller = name2;
            bigger = name1;
        }

        if (isConditionMet) {
            System.out.print(smaller + " fits in " + bigger);

        } else {
            System.out.print("Envelopes cant fit in each other!");

        }
        System.out.println();
        return isConditionMet;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1;
        float a;
        float b;
        String name2;
        float c;
        float d;

        String answer;
        boolean continueProgram;
        do {
            try {
                System.out.print("Enter the name of the first envelope");
                name1 = sc.next();
                System.out.print("Enter the first side of the first envelope");
                a = sc.nextFloat();
                if (a < 0) {
                    throw new InputMismatchException("Invalid input");
                }
                System.out.print("Enter the second side of the first envelope");
                b = sc.nextFloat();
                if (b < 0) {
                    throw new InputMismatchException("Invalid input");
                }
                System.out.println();

                System.out.print("Enter the name of the second envelope");
                name2 = sc.next();
                System.out.print("Enter the first side of the second envelope");
                c = sc.nextFloat();
                if (c < 0) {
                    throw new InputMismatchException("Invalid input");
                }
                System.out.print("Enter the second side of the second envelope");
                d = sc.nextFloat();
                if (d < 0) {
                    throw new InputMismatchException("Invalid input");
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                return;
            }

            compareEnvelopes(name1, name2, a, b, c, d);

            System.out.print("Do you want to continue? Yes/No");
            answer = sc.next();
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
                    System.out.println("Invalid input!");
            }
        }
        while (continueProgram);

        System.out.print("END");

    }

}

