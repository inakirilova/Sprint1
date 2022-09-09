package main;

import java.util.Scanner;


public class Task2 {
    public static void compare() {

        System.out.print("Enter the name of the first envelope");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.print("Enter the first side of the first envelope");
        float a = sc.nextFloat();
        System.out.print("Enter the second side of the first envelope");
        float b = sc.nextFloat();


        System.out.print("Enter the name of the second envelope");
        Scanner scan = new Scanner(System.in);
        String name2 = scan.nextLine();
        System.out.print("Enter the first side of the second envelope");
        float c = scan.nextFloat();
        System.out.print("Enter the second side of the second envelope");
        float d = scan.nextFloat();

        if (a < c && b < d) {
            System.out.print("The first envelope fits in the second");
        } else {
            System.out.print("The first envelope can't fit in the second");
        }
        System.out.println();
    }

    public static void contcomp() {
        System.out.print("Do you want to continue? Yes/No");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        switch (answer) {
            case "yes", "YES", "Yes", "y", "Y": {
                compare();
                contcomp();
                break;
            }
            case "no", "No", "NO", "n", "N": {
                System.out.print("this is the end of the program");
                break;
            }
            default:
                System.out.print("Enter a valid option");
        }
    }

    public static void main(String[] args) {

        compare();
        contcomp();

    }

}

