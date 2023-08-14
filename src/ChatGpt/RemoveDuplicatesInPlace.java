package ChatGpt;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int [] a = {1, 1};
        System.out.println(removeDuplicates(a));
    }

    static int removeDuplicates(int [] nums){

        int i =0;
        int j = 1;
        int ans =0;

        while (j< nums.length){
            if(nums[i] == nums[j]) j++;
            else {
                nums[i+1] = nums[j];
                i++;
                j++;
                ans++;
            }
        }

        return ans+1;

    }
}
