package services;

import java.util.Scanner;

import static common.ConstantMessages.DATA_REQUEST;

public class RequestData {

    public static String[] requestInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(DATA_REQUEST);
        String[] input = scanner.nextLine().split(",");

        while (input.length != 4) {
            System.out.println(DATA_REQUEST);
            input = scanner.nextLine().split(",");

        }
        return input;
    }
}
