package Arrays;

import java.util.Arrays;

public class printSubarrays {
    public static void main(String[] args) {

        int [] arr = {-1,-2,6,-1,3};
        subarrays(arr);

    }
    static void subarrays(int [] arr){
        int totalSubarrays = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <=j; k++) {

                    sum+=arr[k];
                    System.out.print((arr[k]));


                }

                totalSubarrays++;
                System.out.print(" "+sum);
                System.out.println();
                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
            System.out.println();

        }
        System.out.println(maxSum);
        System.out.println(totalSubarrays);
    }


}
