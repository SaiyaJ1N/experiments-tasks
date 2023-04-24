public class ArithmeticSequenceElements {
    public static void main(String[] args) {
        String al = arithmeticSequenceElements(1,-3,10);
        System.out.println(al);
    }
    public static String arithmeticSequenceElements(int a, int d, long n) {
        String res = String.valueOf(a);
        int counter = 1;
        if(d == 0){
            while(counter < n){
                res += ", " + a;
                counter++;
            }
        }

        if(d > 0){
            while(counter < n){
                res += ", " + (a += d);
                counter++;
            }
        }

        if(d < 0){
            while(counter < n){
                res += ", " + (a += d);
                counter++;
            }
        }


        return res;
    }
}
