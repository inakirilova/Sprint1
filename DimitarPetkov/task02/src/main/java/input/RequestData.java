package input;

import java.util.Scanner;

import static common.ConstantMessages.DATA_REQUEST;
import static common.ConstantMessages.INVALID_INPUT;
import static process.DataValidator.isValidNumber;

public class RequestData {
    public static float getSide(String envelope, String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(DATA_REQUEST, envelope, side);
        String envelopeSideInput = scanner.nextLine();
        float envelopeSide;
        while (!isValidNumber(envelopeSideInput)) {
            System.out.println(INVALID_INPUT);
            envelopeSideInput = scanner.nextLine();
        }
        envelopeSide = Float.parseFloat(envelopeSideInput);
        return envelopeSide;
    }

}
