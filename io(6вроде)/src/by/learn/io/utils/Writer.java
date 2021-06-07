package by.learn.io.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    public static void toDirectory(List<String> lines, String directory) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(directory)))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
