import common.ConstantMessages;
import java.util.Scanner;

public class TriangleValidator {

    public static boolean isValidNumber(String data) {
        try {
            return Float.parseFloat(data) > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static float[] createTriangleSides(String[] input) {
        Scanner scanner = new Scanner(System.in);

        float[] sidesArray = new float[3];
        for (int i = 1; i <= 3; i++) {
            boolean isValidSide = false;
            while (!isValidSide) {
                if (isValidNumber(input[i])) {
                    sidesArray[i - 1] = Float.parseFloat(input[i]);
                    isValidSide = true;
                } else {
                    System.out.printf(ConstantMessages.SIDE_NOT_VALID_NUMBER, i);
                    input[i] = scanner.nextLine();
                }
            }
        }

        for (int i = 0; i <= 2; i++) {
        boolean isValidTriangle = false;
            while (!isValidTriangle) {
                float referencePerimeter = sidesArray[0] + sidesArray[1] + sidesArray[2];
                referencePerimeter -= sidesArray[i];

                if (sidesArray[i] >= referencePerimeter) {
                    System.out.println(ConstantMessages.TRIANGLE_NOT_VALID);
                    input = RequestData.requestInput();
                    sidesArray = createTriangleSides(input);
                } else {
                    isValidTriangle = true;
                }
            }
        }
        return sidesArray;
    }

    public static Float calculateArea(String[] input) {
        float[] sideArray = createTriangleSides(input).clone();
        float halfPerimeter = ((sideArray[0] + sideArray[1] + sideArray[2]) / 2);
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - sideArray[0])
                * (halfPerimeter - sideArray[1])
                * (halfPerimeter - sideArray[2]));
    }
}
