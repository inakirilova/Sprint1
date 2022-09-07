import common.ConstantMessages;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        Map<String, Float> unsortedMapOfTriangles = new LinkedHashMap<>();
        boolean gameContinue = true;
        while (gameContinue) {
            String[] input = RequestData.requestInput();
            String name = input[0].trim();
            float area = TriangleValidator.calculateArea(input);
            if (unsortedMapOfTriangles.containsKey(name)) {
                System.out.println(ConstantMessages.TRIANGLE_NAME_EXIST);
                gameContinue = ResponseHandler.responseHandler("y");
            } else {
                unsortedMapOfTriangles.put(name, area);

                System.out.println(ConstantMessages.TO_CONTINUE);
                String answer = scanner.nextLine();
                gameContinue = ResponseHandler.responseHandler(answer);
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");
        AtomicInteger count = new AtomicInteger(1);
        unsortedMapOfTriangles.entrySet()
                .stream()
                .sorted(
                        (left, right) -> {
                            int result = right.getValue().compareTo(left.getValue());
                            if (result == 0) {
                                result = left.getKey().compareTo(right.getKey());
                            }
                            return result;
                        }
                )

                .forEach(entry -> System.out.printf("%d. [Triangle %s]: %scm\n", count.getAndAdd(1),
                        entry.getKey(),df.format(entry.getValue())));
    }
}
