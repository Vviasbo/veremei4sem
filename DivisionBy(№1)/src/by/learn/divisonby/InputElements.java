package by.learn.divisonby;

import java.util.Scanner;

public class InputElements {
    public static int[] inputElements(int[] arrayOfNumbers) {
        Scanner buffer = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = buffer.nextInt();
        }
        return arrayOfNumbers;
    }

}
