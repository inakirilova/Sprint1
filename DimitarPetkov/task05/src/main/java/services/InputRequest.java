package services;

import java.util.Scanner;

import static common.ConstantMessages.*;
import static services.InputConverterBulgarian.numberTextConverterBG;
import static services.InputConverterEnglish.numberTextConverterEN;
import static validator.DataValidator.inputDataValidator;


public class InputRequest {

    public static void inputRequester() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(REQUEST_INPUT);
        String respond = scanner.nextLine().trim();

        if (inputDataValidator(respond)) {

            System.out.println(CHOOSE_THE_LANGUAGE);
            String language = scanner.nextLine().trim();
            System.out.printf(RESULT, respond, languageSeparator(language, respond));

        } else {
            System.out.println(INVALID_INPUT);
        }
    }

    public static String languageSeparator(String language, String request) {
        if (language.equalsIgnoreCase("EN") || language.equals("")) {
            return numberTextConverterEN(request);
        } else if (language.equalsIgnoreCase("BG")) {
            return numberTextConverterBG(request);
        } else {
            return INVALID_LANGUAGE;
        }
    }

}
