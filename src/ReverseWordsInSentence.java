public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String testString = reverseWords("   ");
        System.out.println(testString);
    }
    public static String reverseWords(final String original){
        String[] splitted = original.split(" ");
        if(splitted.length == 0 ) return "";
        String result = reverseString(splitted[0]);
        for(int i = 1; i < splitted.length; i++){
            result += " " + reverseString(splitted[i]);
        }
        return result;
    }

    public static String reverseString(String a){
        String result = "";
        for(int i = a.length() - 1; i >= 0; i--){
            result += a.charAt(i);
        }
        return result;
    }
}