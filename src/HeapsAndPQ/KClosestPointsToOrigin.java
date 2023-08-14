package HeapsAndPQ;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {

        int[][] arr = {
                {2,2}, {2,2}, {2,2}, {2,2}, {2,2}, {2,2},{1,1}
        };
        System.out.println(Arrays.deepToString(kClosest(arr,1)));

    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < points.length; i++) {
            pq.offer(new Pair(points[i][0], points[i][1]));
        }

        for (int i = 0; i < k ; i++) {
            Pair p = pq.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }

    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        int dist;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }
        public int compareTo(Pair other) {
            return Integer.compare(this.dist, other.dist);
        }



    }
}
