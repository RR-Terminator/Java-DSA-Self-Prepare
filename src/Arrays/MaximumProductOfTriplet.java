package Arrays;

import java.util.Arrays;

public class MaximumProductOfTriplet {
    public static void main(String[] args) {

        Long[] arr = {(long) -3, (long) -5, 1L, 0L, 8L, 3L, (long) -2};
        System.out.println(maxTripletProduct(arr, 7));

    }

    // Time Complexity O(n)

//    public static Long maxTripletProduct(Long[] arr, int n) {
//        // Complete the function
//
//        long max1 = Long.MIN_VALUE;
//        long max2 = max1;
//        long max3 = max1;
//
//        long min1 = Long.MAX_VALUE;
//        long min2 = min1;
//
//        for (long num : arr) {
//
//            if (num >= max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = num;
//            } else if (num >= max2) {
//                max3 = max2;
//                max2 = num;
//            } else if (num >= max3) {
//                max3 = num;
//            }
//
//            if (num <= min1) {
//                min2 = min1;
//                min1 = num;
//            } else if (num <= min2) {
//                min2 = num;
//            }
//
//        }
//
//
//        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
//
//    }


    // Time Complexity O(nlogn) Due to Sorting The Array

    public static Long maxTripletProduct(Long[] arr, int n) {

        Arrays.sort(arr);

        return Math.max(arr[0]*arr[1]*arr[n-1] , arr[n-1]*arr[n-2]*arr[n-3]);
    }
}
