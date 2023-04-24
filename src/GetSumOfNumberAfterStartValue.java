public class GetSumOfNumberAfterStartValue {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int result = getSum(array, 8);
        System.out.println(result);
    }
    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        boolean foundStartValue = false;

        for(int i : values){
            if(foundStartValue){
                sum += i;
            }
            if(i == startValue){
                foundStartValue = true;
            }
        }
        return sum;
    }
}


  /*  Даны массив чисел values и значение startValue. В этой задаче найди и верни сумму всех чисел, находящихся в массиве после значения startValue.

        Обрати внимание:

        в результате, сумма не должна содержать значение startValue;
        если массив не содержит startValue – верни 0;
        если массив содержит только одно значение, равное startValue – верни 0.*/