package by.learn.divisonby;

public class CreateAnArray {
    public static int[] createAnArray() {
        final int SIZE_OF_ARRAY = GetSizeOfArray.getSizeOfArray();
        if (SIZE_OF_ARRAY > 0) {
            return new int[SIZE_OF_ARRAY];
        } else throw new IllegalArgumentException(SIZE_OF_ARRAY + " is less than (or equals) 0");
    }
}
