public class Isogram {
    public static void main(String[] args) {
        boolean isIsogram = isIsogram("moOse");
        System.out.println(isIsogram);
    }

    public static boolean  isIsogram(String str) {
        if(str.length() == 0){
            return true;
        }
            String newS = "" + str.charAt(0);
            for(int i = 1; i < str.length(); i++){
                newStr += str.charAt(i);
                for(int j = 0; j < i; j++){
                    if(str.charAt(i) == str.charAt(j) || str.charAt(i) == Character.toUpperCase(str.charAt(j))){
                        return false;
                    }
                }
            }
            return true;
        }

}
