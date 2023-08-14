package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
    }

    public static int [] twoSum(int [] arr ,int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]+arr[j] == target) return new int[]{i,j};
             }
        }
        return new int[] {-1,-1};

    }



}
