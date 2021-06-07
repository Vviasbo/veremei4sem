package by.learn.io.utils;

import java.util.ArrayList;
import java.util.List;

public class Reverser {
    public static List<String> reverse(List<String> lines) {
        List<String> reversedLines = new ArrayList<>();
        for (String line : lines) {
            reversedLines.add(new StringBuilder().append(line).reverse().toString());
        }
        return reversedLines;
    }
}
