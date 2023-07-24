public class LevenshteinDistanceTask {
    private final String[] words;

    public LevenshteinDistanceTask(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        String mostSimilarWord = "";
        int minDistance = Integer.MAX_VALUE;
        for (String word : words) {
            int distance = levenshteinDistance(term, word);
            if (distance < minDistance) {
                mostSimilarWord = word;
                minDistance = distance;
            }
        }
        return mostSimilarWord;
    }

    private int levenshteinDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                int cost = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost));
            }
        }
        return dp[word1.length()][word2.length()];
    }
}

    // Solution without LevenshteinDistance usage
  /*  public String findMostSimilar(String to) {
        int max = Integer.MIN_VALUE;
        String result = null;
        for (String word : words) {
            int count = 0;
            int nextIndex = 0;
            String[] letters = word.split("");
            for (String letter : letters) {
                if (to.indexOf(letter, nextIndex) > -1) {
                    count++;
                    nextIndex = to.indexOf(letter, nextIndex);
                } else {
                    count--;
                }
            }
            if (count > max) {
                max = count;
                result = word;
            }
        }
        return result;
    }
*/

   //Solution using external library
 /*  public String findMostSimilar(String to) {
       int max = Integer.MIN_VALUE;
       String result = null;
       for (String word : words) {
           int count = 0;
           int nextIndex = 0;
           String[] letters = word.split("");
           for (String letter : letters) {
               if (to.indexOf(letter, nextIndex) > -1) {
                   count++;
                   nextIndex = to.indexOf(letter, nextIndex);
               } else {
                   count--;
               }
           }
           if (count > max) {
               max = count;
               result = word;
           }
       }
       return result;
   }
*/