package by.learn.strings.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringUtils {
    public static List<String> removeMistakes(List<String> lines) {
        for (String line : lines) {
            List<String> words = Arrays.asList(line.split("\\s"));
            for (String word : words) {
                Matcher matcher = Pattern.compile("(.*)PA(.*)").matcher(word);
                if (matcher.find()) {
                    List<Character> charList = matcher.group().chars()
                            .mapToObj(c -> (char) c)
                            .collect(Collectors.toList());
                    charList.set(charList.indexOf('P') + 1,'O');
                    String tempWord = charList.stream().map(String::valueOf).collect(Collectors.joining());
                    words.set(words.indexOf(word),tempWord);
                    String tempLine = words.stream().map(String::valueOf).collect(Collectors.joining(" ")).trim();
                    lines.set(lines.indexOf(line),tempLine);
                }
            }
        }
        return lines;
    }
}
