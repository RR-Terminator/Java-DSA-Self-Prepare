package Algoritms.GreedyAlgo;

import java.util.Arrays;

// Time Complexity = O(nlogn)

// min diff between any two Number if the Distance Between  any Two Numbers
// is Less
// Hence Sort the Arrays and then Calculate the Abs min difference...

public class MinimumABS {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {3,2,1};
        System.out.println(minDiff(arr1,arr2));
    }

    public static int minDiff(int [] A, int [] B){
        int min = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            min  += Math.abs(A[i]-B[i]);
        }

        return min;
    }

}
