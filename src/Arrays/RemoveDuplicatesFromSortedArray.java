package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int n = 0;

        for(int i = 1 ; i < nums.length ;i++){
            if(nums[i]==nums[i-1]){
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }

                n--;
            }
        }
        return n;


    }

}
