


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give the board dimensions (rows and columns), in positive integers. ");
        System.out.println("Height:");
        String heightInput = scanner.nextLine();
        while (!Validator.isValidInt(heightInput)) {
            System.out.println("The number of rows (height) must be a positive integer.\nHeight: ");
            heightInput = scanner.nextLine();
        }
        int height;
        height = Integer.parseInt(heightInput);

        System.out.println("Width:");
        String widthInput = scanner.nextLine();
        while (!Validator.isValidInt(widthInput)) {
            System.out.println("The number of columns (width) must be a positive integer.\nWidth: ");
            widthInput = scanner.nextLine();
        }
        int width;
        width = Integer.parseInt(widthInput);

        String[][] chessBoard;
        chessBoard = Board.boardCreate(height, width);

        PrintMatrix.printMatrix(chessBoard);

    }
}
