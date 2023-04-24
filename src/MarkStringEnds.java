public class MarkStringEnds {
    public static void main(String[] args) {
        String[] str = markStringEnds("helloBitch");
        for (String i : str) {
            System.out.println(i);
        }
    }

    public static String[] markStringEnds(String originalString) {
        int lastIndex = originalString.length() - 1;

        String firstChar = originalString.substring(0, 1).toUpperCase();
        String lastChar = originalString.substring(lastIndex).toUpperCase();

        String firstEnd = firstChar + originalString.substring(1);
        String secondEnd = originalString.substring(0, lastIndex) + lastChar;

        return new String[]{firstEnd, secondEnd};
    }
}

//        char[] arr = originalString.toCharArray();
//        String firstChar = originalString.valueOf(originalString.charAt(0)).toUpperCase();
//        String lastChar = originalString.valueOf(originalString.charAt(arr.length - 1)).toUpperCase();
//
//        String substringF = originalString.substring(1);
//        String substringL = originalString.substring(0, arr.length - 1);
//
//
//        StringBuilder firstCharBuilder = new StringBuilder(firstChar);
//        StringBuilder lastCharBuilder = new StringBuilder();
//
//        firstCharBuilder.append(substringF);
//        lastCharBuilder.append(substringL).append(lastChar);
//
//        String[] word = {firstCharBuilder.toString(),lastCharBuilder.toString()};
//        return word;
