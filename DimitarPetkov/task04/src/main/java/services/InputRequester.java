package services;

import java.util.Scanner;

import static common.Messages.INPUT_INCORRECT;
import static common.Messages.REQUEST_INPUT;

public class InputRequester {

    public static String[] requestInput() {
        Scanner scanner = new Scanner(System.in);
            System.out.println(REQUEST_INPUT);
            String request = scanner.nextLine();
        if (isValidRequest(request) && !request.isBlank()){
            return request.split("\s+");
        } else {
            System.out.println(INPUT_INCORRECT);
            return requestInput();
        }
    }


    static boolean isValidRequest(String input) {
        String[] request = input.trim().split("\s+");

        return request.length > 0 && request.length < 3;
    }
}
