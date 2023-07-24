import java.util.Arrays;

public class QueueInSupermarket {
    public static void main(String[] args) {
        int[] customers = {2, 2, 3, 3, 4, 4};
        int resultArray = calculateTotalTime(customers, 2);
        System.out.println(resultArray);
    }

    public static int calculateTotalTime(int[] customers, int checkout) {
        int[] result = new int[checkout];
        for (int customer : customers) {
            result[0] += customer;
            Arrays.sort(result);
        }
        return result[checkout - 1];

    }
}


//My first solution
//    public static int calculateTotalTime(int[] customers, int checkout) {
//        if (customers.length == 0) {
//            return 0;
//        }
//
//        int totalTime = 0;
//        int max = customers[0];
//        int indexOfMin = 0;
//
//        if (checkout == 1) {
//            for (int customerTime : customers) {
//                totalTime += customerTime;
//            }
//            return totalTime;
//        }
//
//        if (checkout > customers.length) {
//            for (int customerTime : customers) {
//                if (customerTime > max) {
//                    max = customerTime;
//                }
//            }
//            return max;
//        }
//
//        int[] cashBoxes = new int[checkout];
//        for (int i = 0; i < customers.length; i++) {
//            cashBoxes[indexOfMin] += customers[i];
//            int minValue = cashBoxes[0];
//            for (int j = 0; j < cashBoxes.length; j++) {
//                if (cashBoxes[j] <= minValue) {
//                    minValue = cashBoxes[j];
//                    indexOfMin = j;
//                }
//            }
//        }
//        Arrays.sort(cashBoxes);
//        return cashBoxes[cashBoxes.length - 1];
//    }

