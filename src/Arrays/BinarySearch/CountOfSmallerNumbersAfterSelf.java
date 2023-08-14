package Arrays.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {

        int [] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }


    public static List<Integer> countSmaller(int[] nums) {
        int [] arr = Arrays.copyOf(nums,nums.length);

        Arrays.sort(arr);
        List <Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            int size = search(arr,nums[i]);
            ans.add(size);
        }
        return ans;
    }

    private static int search(int[] arr, int num) {
        int s = 0 ;
        int e = arr.length - 1;
        int ans = 0;
        while(s<=e){
            int mid = s +(e-s)/2;

            if (arr[mid]<num) {
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
}
