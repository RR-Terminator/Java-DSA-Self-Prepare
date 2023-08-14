package HeapsAndPQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RelativeRanks {
    public static void main(String[] args) {

        int[] arr = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));


    }

    public static String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            pq.add(new Pair(score[i], i));
        }
        if (!pq.isEmpty()) {
            Pair first = pq.poll();
            ans[first.index] = "Gold Medal";
        }
        if (!pq.isEmpty()) {
            Pair Second = pq.poll();
            ans[Second.index] = "Sliver Medal";
        }
        if (!pq.isEmpty()) {
            Pair third = pq.poll();
            ans[third.index] = "Bronze Medal";
        }
        for (int i = 3; i < score.length && !pq.isEmpty(); i++) {
            Pair curr = pq.poll();
            ans[curr.index] = String.valueOf(i + 1);
        }


        return ans;
    }

    public static class Pair implements Comparable<Pair> {
        int score;
        int index;

        public Pair(int score, int index) {
            this.score = score;
            this.index = index;
        }

        @Override
        public int compareTo(Pair s2) {
            return this.score - s2.score;
        }

    }
}
