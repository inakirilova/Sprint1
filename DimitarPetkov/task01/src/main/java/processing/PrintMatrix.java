package processing;

import static processing.Board.boardCreate;

public class PrintMatrix {
    public static void printMatrix(int[] size) {
        String[][] matrix = boardCreate(size);
        for (String[] arr : matrix) {
            for (String s : arr) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
