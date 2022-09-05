import common.ConstantMessages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, describe two envelopes, by their sides.\nAllowed data: numbers");

        boolean gameContinue = true;
        String input;
        while(gameContinue) {
            float firstEnvelopeSideX = RequestData.getSide("One", "X");
            float firstEnvelopeSideY = RequestData.getSide("One", "Y");
            float secondEnvelopeSideX = RequestData.getSide("Two", "X");
            float secondEnvelopeSideY = RequestData.getSide("Two", "Y");

            String result = EnvelopeAnalysis.compareEnvelopes(firstEnvelopeSideX, firstEnvelopeSideY,
                    secondEnvelopeSideX, secondEnvelopeSideY);
            System.out.println(result);
            System.out.println(ConstantMessages.TO_CONTINUE);
            input = scanner.nextLine();
            gameContinue = DataValidator.responseAnalyze(input);
        }
    }
}
