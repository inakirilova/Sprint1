package main;

import java.util.Scanner;

public class Task5 {

    public static String numberConverters(String number) {
        char[] num = number.toCharArray();
        StringBuilder builder = new StringBuilder();
        int len = num.length;
        if (len == 0) {
            System.out.println("The string is empty.");
            return "";
        }
        if (len > 4) {
            System.out.println("The given number has more than 4 digits.");
            return "";
        }

        String[] onedigit = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twodigits = new String[]{"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] roundnumbers = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] hundreds = new String[]{"Hundred", "Thousand"};

        System.out.print(String.valueOf(num) + ": ");

        if (len == 1) {
            System.out.println(onedigit[num[0] - '0']);
            return onedigit[num[0] - '0'];
        }
        int x = 0;

        while (x < num.length) {
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(onedigit[num[x] - '0'] + " ");
                    System.out.print(hundreds[len - 3] + " ");
                    builder.append(onedigit[num[x] - '0']).append(" ").append(hundreds[len - 3]).append(" ");
                }

                --len;
            } else {
                if (num[x] - '0' == 1) {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(twodigits[sum]);
                    return builder.append(twodigits[sum]).toString();
                } else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
                    System.out.println("Twenty");
                    return builder.append("Twenty").toString();
                } else {
                    int i = (num[x] - '0');
                    if (i > 0) {
                        System.out.print(roundnumbers[i] + " ");
                        builder.append(roundnumbers[i]).append(" ");
                    } else {
                        System.out.print("");
                    }
                    ++x;

                    if (num[x] - '0' != 0) {
                        System.out.println(onedigit[num[x] - '0']);
                        builder.append(onedigit[num[x] - '0']);
                    }
                }
            }
            ++x;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        String number = sc.nextLine();
        String numberWithWords = numberConverters(number);
        System.out.println(numberWithWords);

    }
}
