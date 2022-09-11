import java.math.BigInteger;
import java.util.Scanner;

public class App {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a number or \"exit\" to stop the program.");
            String input = cin.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.startsWith("-")) {
                System.out.print("Minus: ");
                input = input.replace("-", "");
            }

            try {
                BigInteger largeNumber = new BigInteger(input);
                myMagicNumber numberToConvert = new myMagicNumber(largeNumber);
                numberToConvert.printNumberWithText();
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input.");
                cin.nextLine();
            }
        }
    }
}
