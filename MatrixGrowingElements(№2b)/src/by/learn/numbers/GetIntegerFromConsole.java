package by.learn.numbers;

import java.util.Scanner;

public class GetIntegerFromConsole {
    /**
     * @return An input from console
     */
    public static int getIntegerFromConsole() {
        System.out.print("Input a size of a matrix: ");
        Scanner buffer = new Scanner(System.in);
        return buffer.nextInt();
    }
}
