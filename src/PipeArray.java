import java.util.Arrays;

public class PipeArray {
    public static void main(String[] args) {
        int[] testArray = {-1,4};
        int[] resultArray = pipeFix(testArray);
        System.out.println(Arrays.toString(resultArray));

        System.out.println("Love Aleksandr");
    }



        public static int[] pipeFix(int[] numbers) {
            int counter = 1;
            for(int i = 1; i < (numbers[numbers.length - 1])*2; i++){
                if((numbers[0] + i) <= numbers[numbers.length - 1]){
                    counter++;
                }
            }
            int[] resultArray = new int[counter];
            for(int i = 0; i < (numbers[numbers.length - 1])*2; i++){
                if((numbers[0] + i) <= numbers[numbers.length - 1]){
                    resultArray[i] = numbers[0] + i;
                }
            }
            return resultArray;
        }



}
