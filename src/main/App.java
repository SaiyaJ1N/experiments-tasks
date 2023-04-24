package main;

public class App {
    public static void main(String[] args) {
        int[] array = {0,2,3,5,7,9,0,10,11,145,16};
        int[] result = numbersAfterCertain(array, 3);
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    public static int[] numbersAfterCertain(int[] array, int n){
        boolean foundValue = false;
        int counter = 0;

        for(int i : array) {
            if (foundValue) {
                counter++;
            }
            if (i == n) {
                foundValue = true;
            }
        }

        foundValue = false;
        int[] resultArray = new int[counter];
        int index = 0;
        for(int i : array){
            if (foundValue) {
                resultArray[index++] = i;
            }
            if (i == n) {
                foundValue = true;
            }
        }
        return resultArray;
    }
}
