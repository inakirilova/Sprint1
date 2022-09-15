package validator;

public class DataValidator {

    public static boolean inputDataValidator(String input) {
        try {
                Long numberInput = Long.parseLong(input);
            return input.length() != 0
                    && (input.length() <= 1 || !input.startsWith("0"))
                    && !input.startsWith("-");
        } catch (NumberFormatException ex) {
            return  false;
        }
    }
}
