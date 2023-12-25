import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Experiments {
    public static void main(String[] args) {
        System.out.println(check("The quick rown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence){
        String pangramString = sentence.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isLetter)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return pangramString.length() >= 26;
    }
}
