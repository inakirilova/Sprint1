import common.ConstantMessages;

import java.util.Scanner;

public class RequestData {

    public static String[] requestInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConstantMessages.DATA_REQUEST);
        String[] input = scanner.nextLine().split(",");
        while (input.length != 4) {
            System.out.println(ConstantMessages.DATA_REQUEST);
            input = scanner.nextLine().split(",");

        }
        return input;
    }
}
