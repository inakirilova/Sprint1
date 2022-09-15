package services;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static common.ConstantMessages.TO_CONTINUE;
import static common.ConstantMessages.TRIANGLE_NAME_EXIST;
import static services.RequestData.requestInput;
import static services.ResponseHandler.responseHandler;
import static validator.TriangleValidator.calculateArea;

public class TrianglesMapping {
    public static Map<String, Float> trianglesMap() {
        Scanner scanner = new Scanner(System.in);

        Map<String, Float> unsortedMapOfTriangles = new LinkedHashMap<>();
        boolean gameContinue = true;
        while (gameContinue) {
            String[] input = requestInput();
            String name = input[0].trim();
            if (unsortedMapOfTriangles.containsKey(name)) {
                System.out.println(TRIANGLE_NAME_EXIST);
            } else {
                float area = calculateArea(input);
                unsortedMapOfTriangles.put(name, area);

                System.out.println(TO_CONTINUE);
                String answer = scanner.nextLine();
                gameContinue = responseHandler(answer);
            }
        }
        return unsortedMapOfTriangles;
    }
}
