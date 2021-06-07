package by.learn.io.runner;

import by.learn.io.utils.Reader;
import by.learn.io.utils.Reverser;
import by.learn.io.utils.Writer;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> lines = Reader.fromFileAsList("data//input");
        Writer.toDirectory(Reverser.reverse(lines),"data//output//Parser" + lines.size() + ".java");
    }
}
