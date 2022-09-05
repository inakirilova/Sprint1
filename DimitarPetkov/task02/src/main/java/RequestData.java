import common.ConstantMessages;

import java.util.Scanner;

public class RequestData {
    public static float getSide(String envelope, String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(ConstantMessages.DATA_REQUEST, envelope, side);
        String envelopeSideInput = scanner.nextLine();

        while (!DataValidator.isValidNumber(envelopeSideInput)) {
            System.out.println(ConstantMessages.INVALID_INPUT);
            envelopeSideInput = scanner.nextLine();
        }
        return Float.parseFloat(envelopeSideInput);
    }

}
