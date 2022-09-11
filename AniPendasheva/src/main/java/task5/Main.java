package task5;

import java.util.Scanner;

import static task5.InputValidator.inputValues;

public class Main {
    public static void testingValues() throws Exception {
        NumberWord nw = new NumberWord();
        nw.setNumWord("1");
        System.out.println(nw);

        nw.setNumWord("11");
        System.out.println(nw);

        nw.setNumWord("45");
        System.out.println(nw);

        nw.setNumWord("145");
        System.out.println(nw);

        nw.setNumWord("1145");
        System.out.println(nw);

        nw.setNumWord("1045");
        System.out.println(nw);

        nw.setNumWord("-1000");
        System.out.println(nw);

        nw.setNumWord("1000000000");
        System.out.println(nw);

        nw.setNumWord("1123456789");
        System.out.println(nw);

        nw.setNumWord(Integer.MAX_VALUE + "");
        System.out.println(nw);

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        testingValues();
        System.out.println("Type in Integer number to be converted to word");
        inputValues(scanner);

    }
}
