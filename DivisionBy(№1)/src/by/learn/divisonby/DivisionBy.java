package by.learn.divisonby;

public class DivisionBy {
    public static void checkDividedBy(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 3 == 0 || arrayOfNumbers[i] % 9 == 0) {
                System.out.print(arrayOfNumbers[i] + " ");
            }
        }
    }
}
