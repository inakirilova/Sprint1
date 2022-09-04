
public class Board {
    static String[][] boardCreate(int height, int width) {
        String[][] matrix = new String[height][width];
        boolean blackCell = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean oddCellsRow = j < matrix[i].length - 1 || matrix[i].length % 2 > 0;
                if (blackCell) {
                    matrix[i][j] = "*";
                    if(oddCellsRow) {
                        blackCell = false;
                    }
                } else {
                    matrix[i][j] = " ";
                    if(oddCellsRow) {
                        blackCell = true;
                    }
                }
            }
        }
        return matrix;
    }
}
