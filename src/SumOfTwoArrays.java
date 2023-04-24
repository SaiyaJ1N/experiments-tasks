public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[]first = {1};
        int[]second = {8,3,4};
        int[] result = getCombinedArray(first, second);
        for( int i : result){
            System.out.print(i + " ");
        }

    }
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int size = firstArray.length + secondArray.length;
        int[] resultArray = new int[size];

        int index = 0;
        for(int elem : firstArray){
            resultArray[index] = elem;
            index++;
        }
        for(int elem : secondArray){
            resultArray[index] = elem;
            index++;
        }

        return resultArray;
    }
}
