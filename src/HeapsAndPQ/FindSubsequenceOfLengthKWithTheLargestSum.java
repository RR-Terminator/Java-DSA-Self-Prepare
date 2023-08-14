package HeapsAndPQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public static void main(String[] args) {

        int[] arr = {-1,-2,3,4} ;

        System.out.println(Arrays.toString(maxSubsequence(arr,3)));

    }

    public static int[] maxSubsequence(int[] nums, int k) {

        int [] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num: nums ) {
            pq.add(num);
        }
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            ans[i] = pq.poll();
        }

        Collections.reverse(List.of(ans));

        return  ans;

    }
}
