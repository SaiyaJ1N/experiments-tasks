import java.util.Arrays;

public class FormMinimalValue {
    public static void main(String[] args) {
        int[] arrayStr = {6, 7, 8, 7, 6, 6};
        int result = getMinValue((arrayStr));
        System.out.println(result);
    }


    public static int getMinValue(int[] nums) {
        int[] arrayWithoutDublicates = removeDuplicates(nums);
        StringBuilder builder = new StringBuilder();
        for (int num : arrayWithoutDublicates) {
            builder.append(num);
        }
        int result = Integer.parseInt(builder.toString());
        return result;
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }
}
    /* public class MinimumValue {
  public static int getMinValue(int[] nums) {
    int result = 0;
    for (int i = 1; i <= 9; i++) {
      for (int num : nums) {
        if (num == i) {
          result = result * 10 + num;
          break;
        }
      }
    }
    return result;
  }
}
*/
