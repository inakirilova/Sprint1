package validator;

public class Validator {

    public static boolean isValidInt(String input) {
        try {
            return Integer.parseInt(input) > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
