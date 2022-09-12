package Task1;

import java.util.Scanner;

import static Task1.Printer.drawChessBoard;



public class InputValidator {
    public static void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in height and width! ");
        System.out.println("Height : ");
        String inputRows = scanner.nextLine();
        System.out.println("Width : ");
        String inputColumns = scanner.nextLine();
        try {
            int rows = Integer.parseInt(inputRows);
            int columns = Integer.parseInt(inputColumns);
            drawChessBoard(rows, columns);
        } catch (Exception e) {
            System.out.println("Please type in numbers!");
            inputValues();
        }
    }

    public static void areNumsPositive (int height, int width) {
        if (height < 0) {
            System.out.println("Please give valid height");
            inputValues();
        } else if (width < 0) {
            System.out.println("Please give valid width");
            inputValues();
        }
    }
}
