package by.learn.textparser.runner;

import by.learn.textparser.components.Text;
import by.learn.textparser.utils.Parser;
import by.learn.textparser.utils.Reader;

public class RunnerSecond {
    public static void main(String[] args) {
        String path = "string-templates/text2.txt";
        Text text = new Text(Reader.fromFile(path));
        System.out.println(text);
        text = new Text(Parser.getSentences(text));
        System.out.println(text);
    }
}
