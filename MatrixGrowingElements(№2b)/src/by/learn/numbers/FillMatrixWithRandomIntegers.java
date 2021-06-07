package by.learn.numbers;

import java.util.Random;

/**
 * Name speaks for itself
 * @version 0.1
 */
public class FillMatrixWithRandomIntegers {
    /**
     * @param matrix Given matrix
     */
    public static void fillMatrixWithRandomIntegers(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(matrix.length * 2 + 1) - matrix.length;
            }
        }
    }
}
