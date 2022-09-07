package Task1;


import static Task1.InputValidator.inputValues;
import static Task1.Printer.drawChessBoard;

public class Main {

    public static void main(String[] args) {
        drawChessBoard(5, 5);
        drawChessBoard(-1, 0);
        inputValues();
    }
}
