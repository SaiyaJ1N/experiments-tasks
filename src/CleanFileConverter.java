
public class CleanFileConverter {
    public static void main(String[] args) {
        String dirtyFile = "1231231223123131_myFile.tar.gz2";
        String result = extractFileName(dirtyFile);
        System.out.println(result);
    }


    public static String extractFileName(String dirtyFileName) {
        int indexOfFirstLetter = getIndexOfFirstLetter(dirtyFileName);
        int indexOfSecondDot = getIndexOfSecondDot(dirtyFileName);
        String cleanFileName = dirtyFileName.substring(indexOfFirstLetter, indexOfSecondDot);
        return cleanFileName;
    }

    public static int getIndexOfFirstLetter(String dirtyFileName) {
        int index = 0;
        for (int i = 0; i < dirtyFileName.length(); i++) {
            if (Character.isLetter(dirtyFileName.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int getIndexOfSecondDot(String dirtyName) {
        return dirtyName.indexOf(".", dirtyName.indexOf(".") + 1);
    }
}
