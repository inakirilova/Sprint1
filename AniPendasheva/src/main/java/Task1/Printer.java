package Task1;

import static Task1.InputValidator.areNumsPositive;

public class Printer {
    public static String drawChessBoard(int height, int width) {
        StringBuilder sb = new StringBuilder();
        try {
            areNumsPositive ( height, width);
            if ( height < 0) {
               sb.append("Please give valid height");
            }
            if ( height < 0) {
                sb.append("Please give valid width");
            }

            for (int i = 0, j = 0; i < height && j < width; ) {
                String s1 = "*";
                String s2 = " ";

                if (i % 2 != 0) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                if (j % 2 == 0) {
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
                j++;
                if (j == width && i != height-1) {
                    sb.append("\n");
                    i++;
                    j = 0;
                }
            }
           // sb.append("\n");

        } catch (Exception e) {
            sb.append("Invalid format input");
        }
        return sb.toString();
    }


}
