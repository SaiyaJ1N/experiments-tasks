import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {-3, -2, -6, -4, -2, -6, -3};
        int result = findSingleNumber(nums);
        System.out.println(result);
    }

    public static int findSingleNumber(int[] nums) {
        return Arrays.stream(nums)
                .reduce(0, (x, y) -> x ^ y);
    }
}

