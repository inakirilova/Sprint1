package Task2;

import java.util.Scanner;

public class App {
    private static final String instructions = "The program is going to ask you to enter lengths for two sides," +
            " about two envelopes, and then it is going to tell you if the first envelope can fit the second inside of it.";

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Envelope envelope1 = new Envelope();
        Envelope envelope2 = new Envelope();

        System.out.println(instructions);

        while (true) {
            envelope1.askForParams();
            envelope2.askForParams();

            if (envelope1.canItFit(envelope2)) {
                System.out.println("Envelope " + envelope1 + " can fit " + envelope2);
            } else {
                System.out.println("Envelope " + envelope1 + " can't fit " + envelope2);
            }

            System.out.println("Do you want to continue?");
            String answer = cin.nextLine();

            if (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("Y")) {
                //continue;
            } else {
                break;
            }
        }

        cin.close();
    }
}
