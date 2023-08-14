package HeapsAndPQ;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySorted {
    public static void main(String[] args) {

        int [] arr =  {6,5,3,2,8,10,9};

        System.out.println(nearlySorted(arr,7,3));

    }

    static ArrayList<Integer> nearlySorted(int[] arr, int num, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < num; i++) {
            pq.add(arr[i]);
            if (pq.size() >k) {
                list.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }

        return list;
    }
}
