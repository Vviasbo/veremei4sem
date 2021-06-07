package by.learn.numbers;

/**
 * The method shows matrix's elements
 */
public class WriteMatrixInConsole {
    /**
     * @see WriteMatrixInConsole
     * @param matrix Given matrix
     */
    public static void writeMatrixInConsole(int[][] matrix) {
        System.out.println("Created matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
