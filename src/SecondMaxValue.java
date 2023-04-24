import java.util.Arrays;

public class SecondMaxValue {
    public static void main(String[] args) {
        int[] res = {1,2,3,4,5,6,78,89,-123,-56};
        int result = maxValue(res);
        System.out.println(result);
        Arrays.sort(res);
        System.out.println(res[res.length - 2]);
    }

    public static int maxValue(int[] n) {
        int max = n[0];
        for (int v : n) {
            if (v > max) {
                max = v;
            }
        }
        int[] difArr = new int[n.length];
        for (int i = 0; i < difArr.length; i++) {
            difArr[i] = max - n[i];
        }


        int min = difArr[0];
        int index = 0;
        for (int i = 0; i < difArr.length; i++) {
            if (difArr[i] < min && difArr[i] != 0) {
                min = difArr[i];
                index = i;
            }
        }
        return n[index];
    }
}


