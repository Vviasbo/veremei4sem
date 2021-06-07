package by.learn.numbers;

/**
 * The main class provides calculating
 * the greatest number of matrix's growing elements
 * @author Kiril Don-Shinaiko
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
	final int SIZE_OF_MATRIX = GetIntegerFromConsole.getIntegerFromConsole();
	int[][] matrix = new int[SIZE_OF_MATRIX][SIZE_OF_MATRIX];
	FillMatrixWithRandomIntegers.fillMatrixWithRandomIntegers(matrix);
	WriteMatrixInConsole.writeMatrixInConsole(matrix);
	FindMaxNumberOfIncreasingElements.findMaxNumberOfIncreasingElements(matrix);
    }
}
