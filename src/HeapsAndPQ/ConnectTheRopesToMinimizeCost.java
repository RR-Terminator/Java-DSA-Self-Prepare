package HeapsAndPQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConnectTheRopesToMinimizeCost {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(minimizeCost(arr));

    }

    public static int minimizeCost(int[] costs) {
        int totalCost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int cost : costs) {
            pq.add(cost);
        }

        while (pq.size() > 1) {
            int c1 = pq.poll();
            int c2 = pq.poll();

            int curr_cost = c1 + c2;
            totalCost += curr_cost;
            pq.add(curr_cost);
        }

        return totalCost;
    }
}
