public class DataValidator {

    public static boolean isValidNumber(String input) {
        float data;
        try {
            data = Float.parseFloat(input);
            return data > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static boolean responseAnalyze(String input) {
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }
}
 