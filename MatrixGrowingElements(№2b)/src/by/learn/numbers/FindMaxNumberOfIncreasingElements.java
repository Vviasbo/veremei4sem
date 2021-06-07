package by.learn.numbers;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxNumberOfIncreasingElements {
    /**
     *
     * @param matrix Given matrix
     */
    public static void findMaxNumberOfIncreasingElements(int[][] matrix) {
        int counterOfIncreasingElements = 0;
        ArrayList<Integer> maxNumbersOIncreasingElements = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j == matrix[i].length - 1) continue;
                if(matrix[i][j] < matrix[i][j + 1]) {
                    counterOfIncreasingElements++;
                }
            }
            maxNumbersOIncreasingElements.add(counterOfIncreasingElements);
            counterOfIncreasingElements = 0;
        }
        System.out.print("Max number of increasing elements: ");
        System.out.println(Collections.max(maxNumbersOIncreasingElements));
    }
}
