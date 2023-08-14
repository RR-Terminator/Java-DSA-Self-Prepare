package Leeetcode;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int [] arr = {9,12,5,10,14,10,3};
        System.out.println(Arrays.toString(pivotArray(arr,10)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }
            if(nums[nums.length - 1 - i] > pivot) {
                int p = nums.length - 1 - i;
                result[right] = nums[p];
                right--;
            }
        }

        while(left <= right) {
            result[left++] = pivot;
            result[right--] = pivot;
        }

        return result;
    }
}
