public class MajorityNumber {
    public static void main(String[] args) {
        int[] arr = {-6, -2, -6, -6, -2, -6, -2, -2, -6};
        int result = findMajor(arr);
        System.out.println(result);
    }

    public static int findMajor(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter > nums.length / 2) {
                return i;
            }
        }
        return 0;
    }
}
