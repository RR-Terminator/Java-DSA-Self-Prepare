package HeapsAndPQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestElements {
    public static void main(String[] args) {

        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};

        System.out.println(Arrays.toString(printKClosest(arr,13,4,35)));

    }

//    static int[] printKClosest(int[] arr, int n, int k, int x) {
//
//        int[] ans = new int[k];
//        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i = 0; i < n; i++) {
//            if(arr[i] != x){
//                pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
//            }
//        }
//
//        while (pq.size() > k) {
//            pq.poll();
//        }
//
//        for (int i = ans.length -1; i >=0 && !pq.isEmpty(); i--) {
//            ans[i] = pq.poll().num;
//        }
//
//
//        return ans;
//
//    }
//
//    public static class Pair implements Comparable<Pair> {
//        int num;
//        int diff;
//
//        public Pair(int num, int diff) {
//            this.num = num;
//            this.diff = diff;
//        }
//
//        @Override
//        public int compareTo(Pair p2) {
//            return this.diff - p2.diff;
//        }
//
//
//    }

    public static int[] printKClosest(int[] arr, int n, int k, int x) {
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int diff1 = Math.abs(a[0] - x);
                int diff2 = Math.abs(b[0] - x);
                if (diff1 == diff2) {
                    return b[0] - a[0];
                }
                return diff1 - diff2;
            }
        });

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                continue;
            }
            heap.offer(new int[]{arr[i], i});
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll()[0];
        }

        return result;
    }
}
