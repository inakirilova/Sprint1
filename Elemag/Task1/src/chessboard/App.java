package chessboard;

import java.util.Scanner;

public class App {
    private static Scanner cin = new Scanner(System.in);
    private static final String instructions = "Enter width and height in integer numbers(1, 3, 54, 107 etc...).";

    public static void main(String[] args) {
        System.out.println(instructions);

            System.out.print("Enter width: ");
            String width = cin.nextLine();

            while(!isANumber(width)){
                width = cin.nextLine();
            }

            System.out.print("Enter height: ");
            String height = cin.nextLine();

            while(!isANumber(height)){
                height = cin.nextLine();
            }

            Chessboard chessboard1 = new Chessboard(Integer.parseInt(width), Integer.parseInt(height));
            chessboard1.printBoard();
    }

    private static boolean isANumber(String input) {
        try {
            return Integer.parseInt(input) > 0;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input format. Enter an integer.");
            return false;
        }
    }
}
