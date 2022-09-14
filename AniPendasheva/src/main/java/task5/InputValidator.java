package task5;

import java.util.Scanner;

public class InputValidator {
    static void inputValues(Scanner scanner) {
        String input = scanner.nextLine();
        NumberWord nw = new NumberWord();
        String inputNum = input;

        if (input.charAt(0) == '-' || input.charAt(0) == '+') {
            inputNum = input.substring(1);
        }
        try {
            Integer.parseInt(inputNum);
            nw.setNumWord(input);
            System.out.println(nw);
        } catch (Exception e) {
            System.out.println("Invalid integer number");
            inputValues(scanner);
        }
    }
}
