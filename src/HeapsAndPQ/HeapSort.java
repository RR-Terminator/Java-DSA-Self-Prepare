package HeapsAndPQ;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {

        int[] arr ={5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(arr)));

    }

    // Time Complexity O(nlogn)
    // Space Complexity O(n) n == size of the array

    public static int[] sortArray(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num: nums) {
            pq.add(num);
        }

        for (int i = 0 ;i < nums.length && !pq.isEmpty(); i++) {
            nums[i] = pq.poll();
        }
        return nums;

    }


}
