package processing;

import common.CommonMessages;
import static validator.Validator.isValidInt;
import java.util.Scanner;

public class InputRequester {

    public static int[] requestChessboardSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CommonMessages.INITIAL_MESSAGE);
        System.out.println(CommonMessages.HEIGHT);
        String heightInput = scanner.nextLine();
        while (!isValidInt(heightInput)) {
            System.out.println(CommonMessages.INVALID_ROWS_INPUT);
            heightInput = scanner.nextLine();
        }
        int height;
        height = Integer.parseInt(heightInput);

        System.out.println(CommonMessages.WIDTH);
        String widthInput = scanner.nextLine();
        while (!isValidInt(widthInput)) {
            System.out.println(CommonMessages.INVALID_COLUMNS_INPUT);
            widthInput = scanner.nextLine();
        }
        int width;
        width = Integer.parseInt(widthInput);
        return new int[]{height, width};
    }
}
