import java.util.Scanner;

public class InputRequest {

    public static String inputRequester() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a integer number " +
                "(no symbols and spaces) to convert it in words: ");
        return scanner.nextLine();
    }
}
