
import static common.ConstantMessages.INITIAL_MESSAGE;
import static common.ConstantMessages.TO_CONTINUE;
import static input.RequestData.getSide;
import static process.DataValidator.responseAnalyze;
import static process.EnvelopeAnalysis.compareEnvelopes;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(INITIAL_MESSAGE);
        boolean gameContinue = true;

        while(gameContinue) {

            System.out.println(compareEnvelopes(
                    getSide("One", "A"),
                    getSide("One", "B"),
                    getSide("Two", "C"),
                    getSide("Two", "D")));

            System.out.println(TO_CONTINUE);

            gameContinue = responseAnalyze(scanner.nextLine());
        }
    }
}
