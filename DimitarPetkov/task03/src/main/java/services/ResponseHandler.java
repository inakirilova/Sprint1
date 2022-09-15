package services;

public class ResponseHandler {

    public static boolean responseHandler(String input) {
        return (input.equalsIgnoreCase("y"))
                || (input.equalsIgnoreCase("yes"));
    }
}
