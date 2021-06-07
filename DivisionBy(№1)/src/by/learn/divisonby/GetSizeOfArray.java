package by.learn.divisonby;

import java.util.Scanner;

public class GetSizeOfArray {
    public static int getSizeOfArray() {
        Scanner buffer = new Scanner(System.in);
        System.out.print("Enter a number of elements: ");
        return buffer.nextInt();
    }
}
