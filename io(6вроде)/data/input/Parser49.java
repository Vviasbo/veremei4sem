package by.learn.textparser.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String fromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append(reader.readLine());
            }
            return sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
package by.learn.textparser.utils;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class Reader {
    public static String fromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append(reader.readLine());
            }
            return sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
public class Reader {
    public static String fromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append(reader.readLine());
            }