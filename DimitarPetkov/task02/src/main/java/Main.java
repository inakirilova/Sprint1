import common.ConstantMessages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, describe two envelopes, by their sides.\nAllowed data: numbers");

        boolean gameContinue = true;
        while(gameContinue) {
            float firstEnvelopeSideX = RequestData.getSide("First", "A");
            float firstEnvelopeSideY = RequestData.getSide("First", "B");
            float secondEnvelopeSideX = RequestData.getSide("Second", "C");
            float secondEnvelopeSideY = RequestData.getSide("Second", "D");

            String result = EnvelopeAnalysis.compareEnvelopes(firstEnvelopeSideX, firstEnvelopeSideY,
                    secondEnvelopeSideX, secondEnvelopeSideY);
            System.out.println(result);
            System.out.println(ConstantMessages.TO_CONTINUE);
            gameContinue = DataValidator.responseAnalyze(scanner.nextLine());
        }
    }
}
