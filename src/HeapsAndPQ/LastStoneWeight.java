package HeapsAndPQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int [] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }

    // Time Complexity O(nlogn)
    // Space Complexity O(n) as we use extra space

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones ) {
            pq.add(stone);
        }

        while (pq.size() >1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if (s1 != s2) {
                int ans = s1 - s2;
                pq.add(ans);
            }
        }
        return !pq.isEmpty() ? pq.peek() :  0;
    }
}
