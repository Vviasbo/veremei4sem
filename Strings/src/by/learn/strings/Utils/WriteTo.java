package by.learn.strings.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteTo {
    public static void file(String path, List<String> lineList) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                writer.write("");
                for(String line : lineList) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
