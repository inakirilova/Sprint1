public class DataValidator {

    public static boolean isValidNumber(String input) {
        try {
            return Float.parseFloat(input) > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static boolean responseAnalyze(String input) {
        return (input.equalsIgnoreCase("y")) || (input.equalsIgnoreCase("yes"));
    }
}
 