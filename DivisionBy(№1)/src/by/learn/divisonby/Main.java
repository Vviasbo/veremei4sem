package by.learn.divisonby;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbers = CreateAnArray.createAnArray();
        InputElements.inputElements(arrayOfNumbers);
        DivisionBy.checkDividedBy(arrayOfNumbers);
    }
}
