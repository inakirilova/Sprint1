package task5;
import java.util.Scanner;

public class InputValidator {
    static void inputValues(Scanner scanner) throws Exception {
        String input = scanner.nextLine();
        NumberWord nw = new NumberWord();
        String inputNum = input;

            if (input.charAt(0) == '-' || input.charAt(0) == '+') {
                inputNum = input.substring(1);
            }
        try {
            Integer.parseInt(inputNum);
        } catch (Exception e){
            System.out.println("Invalid number");
            inputValues(scanner);
        }

        nw.setNumWord(input);
        System.out.println(nw);

    }
}
