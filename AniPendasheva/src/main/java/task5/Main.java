package task5;

import java.util.Scanner;

import static task5.InputValidator.inputValues;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Integer number to be converted to word");
        inputValues(scanner);
    }
}
