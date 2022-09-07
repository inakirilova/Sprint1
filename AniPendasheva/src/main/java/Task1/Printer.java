package Task1;

import static Task1.InputValidator.areNumsPositive;

public class Printer {
    public static void drawChessBoard(int height, int width) {
        try {
            areNumsPositive(height,width);
            for (int i = 0, j = 0; i < height && j <= width; ) {
                String s1 = "*";
                String s2 = " ";

                if (i % 2 != 0) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                if (j % 2 == 0) {
                    System.out.print(s1);
                } else {
                    System.out.print(s2);
                }
                j++;
                if (j == width) {
                    System.out.println();
                    i++;
                    j = 0;
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid format input");
        }
    }


}
