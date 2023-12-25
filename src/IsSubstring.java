public class IsSubstring {
    public class CommonSubstring {
        public static boolean isSubstring(String word1, String word2) {
            for (int i = 0; i < word1.length() - 2; i++) {
                String substring = word1.substring(i, i + 2);
                if (word2.toLowerCase().contains(substring.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
    }
}
