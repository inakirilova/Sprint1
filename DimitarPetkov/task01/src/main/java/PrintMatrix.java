
public class PrintMatrix {
    static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String s : arr) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
