public class SumOfNumbersAfterIntStart {
    public static void main(String[] args) {

    }
    public static int getSum(int[] values, int startValue) {
//Функція
        int sum = 0;
        boolean foundStartValue = false;

        for (int value : values) {
            if (foundStartValue) {
                sum += value;
            } else if (value == startValue) {
                foundStartValue = true;
            }
        }

        return sum;
    }
}
