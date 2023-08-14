package Arrays.SubArrays;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {

        int [] arr ={0,0,0,0,0,0,0,0,0,0};
        System.out.println(subarraySum(arr,0));
    }

    public static int subarraySum(int[] nums, int k) {
   int count = 0;

   HashMap<Integer, Integer> map = new HashMap<>();
   int sum = 0;
        for (int num:nums){
            sum +=num;

            if (map.containsKey(sum-k)) {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }


        return count;
    }
}
