package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static task3.Triangle.*;


public class Main {
    static ArrayList<Triangle> al = new ArrayList<>();

    static void inputValues(Scanner scanner) {
        System.out.println("Please type in information for triangle!");
        System.out.println("input format : <name>, <side length>, <side length>, <side length>!");
        String input = scanner.nextLine();
        input =  input.replaceAll(" ", "");
        String[] arr = input.split(",", 4);
        System.out.println(Arrays.toString(arr));
        if (arr.length != 4) {
            System.out.println("Not correct number of parameters! ");
            inputValues(scanner);
        }
            String size1 = arr[1];
            String size2 = arr[2];
            String size3 = arr[3];
            String name = arr[0];
            setTriangle(size1, size2, size3, name, scanner);
    }

    static void continueProgram(Scanner scanner) {
        System.out.println("Add another triangle? Type in “y” or “yes” (case insensitive) to add another triangle!");
        String toContinue = scanner.nextLine();
        if (toContinue.equalsIgnoreCase("y") || toContinue.equalsIgnoreCase("yes")) {
            inputValues(scanner);
        }
    }

    //round to two .00
    public static void outPutPrint() {
        StringBuilder sb = new StringBuilder();
        int number = 1;
        sb.append("============= Triangles list: ================\n");
        for (Triangle t : al) {
            sb.append(number);
            sb.append(". [Triangle ");
            sb.append(t.getName());
            sb.append("]: ");
            sb.append(String.format("%.2f", t.getArea()));
            sb.append(" cm");
            sb.append("\n");
            number++;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in triangles to be sorted by area");
        inputValues(scanner);
        sortByAreaDesc(al, comp);
        outPutPrint();
    }
}
