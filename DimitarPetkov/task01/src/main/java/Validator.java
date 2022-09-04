public class Validator {

    static boolean isValidInt(String input) {
        try {
            return Integer.parseInt(input) > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
