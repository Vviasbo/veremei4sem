package by.learn.strings.StringsRunner;

import by.learn.strings.Utils.ReadFrom;
import by.learn.strings.Utils.WriteTo;
import by.learn.strings.Utils.StringUtils;

import java.util.List;

public class StringsRunner {
    public static void main(String[] args) {
        List<String> lines = ReadFrom.fileByLines("/Users/kvera/Desktop/жава/Strings/examples/strings.txt");
        lines = StringUtils.removeMistakes(lines);
        WriteTo.file("/Users/kvera/Desktop/жава/Strings/examples/strings.txt",lines);
    }
}
