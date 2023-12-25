import java.util.*;

public class isPrimeNumber {
    public static void main(String[] args) {
        String result = getPrimorialOfNumber(5);
        System.out.println(result);
    }

    public static String getPrimorialOfNumber(int number) {
        int counterOfPrime = 0;
        int num = 2;
        int result = 1;
        while (counterOfPrime != number) {
            if (isPrimeNumber(num)) {
                result *= num;
                counterOfPrime++;
            }
            num++;
        }
        return String.valueOf(result);
    }

    private static boolean isPrimeNumber(int num) {
        int remainder;
        for (int i = 2; i <= num / 2; i++) {
            remainder = num % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}

