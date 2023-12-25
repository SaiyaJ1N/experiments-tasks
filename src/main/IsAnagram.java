package main;

public class IsAnagram {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("foefet", "toffee");
        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        int latterCounter = 0;
        for (int i = 0; i < original.length(); i++)
            for (int j = 0; j < original.length(); j++) {
                if (test.charAt(i) == original.charAt(j) || test.charAt(i) == Character.toLowerCase(original.charAt(j)) || test.charAt(i) == Character.toUpperCase(original.charAt(j))) {
                    latterCounter++;
                    break;
                }
            }
        return latterCounter == original.length();
    }
}
