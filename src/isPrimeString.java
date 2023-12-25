import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class isPrimeString {
    public static void main(String[] args) {
        System.out.println(isPrime("otto"));

    }

    public static boolean isPrime(String string) {
        if (string.length() <= 3) {
            return true;
        }

        String substring = string.substring(0, getIndexOfRepeatableChar(string));
        String resultString = string.replaceAll(substring, "");
        return resultString.length() > 0;
    }

    private static int getIndexOfRepeatableChar(String string) {
        int index = 0;
        for (int i = 1; i < string.length(); i++) {
            if (i == string.length() - 2) {
                break;
            }
            if (string.substring(0, 2).equals(string.substring(i, i + 2))) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Correct mentor solution
//    public static boolean isPrime(String string) {
//        return (string + string).indexOf(string, 1) == string.length();
//    }
}
