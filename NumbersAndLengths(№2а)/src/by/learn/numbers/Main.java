package by.learn.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String AnInputFromConsole() {
        Scanner buffer = new Scanner(System.in);
        String stringOfNumbers = buffer.nextLine();
        return stringOfNumbers;
    }

    static int[] StringToArrayOfNumbers(String stringOfNumbers) {
        int[] arrayOfNumbers;
        if (stringOfNumbers.length() > 0) {
            arrayOfNumbers = Arrays.stream(stringOfNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        } else throw new StringIndexOutOfBoundsException("String is empty");
        return arrayOfNumbers;
    }

    /**
     * The method provides calculating number's length
     */
    static double lengthOfNumber(int number) {
        return String.valueOf(number).length();
    }

    /**
     * The method provides calculating length of all numbers array containing
     */
    static int wholeLength(int[] arrayOfNumbers) {
        int wholeLength = 0;
        if (arrayOfNumbers.length > 0) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                wholeLength += lengthOfNumber(arrayOfNumbers[i]);
            }
        } else throw new ArrayStoreException("Array is empty");
        return wholeLength;
    }

    static void ShowNumbersBiggerThanAverageLength(int[] arrayOfNumbers, double averageLength) {
        System.out.print("Numbers whose length is bigger than average length: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (lengthOfNumber(arrayOfNumbers[i]) > averageLength) {
                System.out.print(arrayOfNumbers[i] + " ");
            }
        }
    }

    static void ShowNumbersLesserThanAverageLength(int[] arrayOfNumbers, double averageLength) {
        System.out.print("\nNumbers whose length is less than average length: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (lengthOfNumber(arrayOfNumbers[i]) < averageLength) {
                System.out.print(arrayOfNumbers[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter elements: ");
        String stringOfNumbers = AnInputFromConsole();

        int[] arrayOfNumbers = StringToArrayOfNumbers(stringOfNumbers);

        double averageLength = (double)wholeLength(arrayOfNumbers) / (double)arrayOfNumbers.length;
        System.out.println("Average length: " + averageLength);

        ShowNumbersBiggerThanAverageLength(arrayOfNumbers,averageLength);
        ShowNumbersLesserThanAverageLength(arrayOfNumbers,averageLength);

        System.out.println("\n\nAuthor: Kostya Veramei");
        System.out.println("Date of getting: Sat May 1 11:15:11 MSK 2021");
        System.out.println("Date of delivery: " + new java.util.Date().toString());
    }
}
