import java.util.Arrays;

public class Experiments {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int res = nthPower(arr, 3);
        System.out.println(res);
        String a = "asdfg";
        System.out.println(a.length() / 2);

    }


        public static int nthPower(int[] array, int n) {
            if(n >= array.length) {
                return -1;
            }

            int powerі = 0;
            for(int i = 0; i < array.length; i++){
                if(i == n){
                    powerі = power(array[i], n);
                }
            }
            return powerі;
        }

        public static int power(int a, int n){
        int res = a;
        for(int i = 1; i < n; i++){
            res *= a;
        }
        return res;
        }
}


