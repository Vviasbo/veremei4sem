package by.learn.strings.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFrom {
    public static List<String> fileByLines(String path) {
        List<String> line = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String buffer;
            while ((buffer = reader.readLine()) != null) {
                line.add(buffer);
            }
            reader.close();
            return line;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
