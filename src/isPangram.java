import java.util.*;
import java.util.stream.Collectors;

public class isPangram {
    public static void main(String[] args) {
        String result = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean isPangram = isPangram(result);
        System.out.println(isPangram);
    }

    // There`s two solutions of Pangram
//    private static boolean isPangram(String string) {
//        String sortedString = string.chars()
//                .mapToObj(ch -> (char) ch)
//                .map(String::valueOf)
//                .distinct()
//                .collect(Collectors.joining());
//        return sortedString.length() >= 26;
//    }

    public static boolean isPangram(String sentence) {
        for (char letter = 'a'; letter < 'z'; letter++) {
            if (!sentence.toLowerCase().contains("" + letter)) {
                return false;
            }
        }
        return true;
    }
}





