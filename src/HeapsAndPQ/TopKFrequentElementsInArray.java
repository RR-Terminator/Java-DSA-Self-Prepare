package HeapsAndPQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsInArray {
    public static void main(String[] args) {

        int[] arr = {8, 1, 1, 2, 2, 3, 3, 3, 4};

        System.out.println(Arrays.toString(topKFrequent(arr, 2)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        // create a HashMap to store the frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // create a PriorityQueue to store the top k elements with highest frequency
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);
            pq.offer(new Element(num, freq));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // create an array of top k elements with highest frequency
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll().num;
        }

        return result;
    }

    static class Element implements Comparable<Element> {
        int num;
        int freq;

        public Element(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        public int compareTo(Element other) {
            if (this.freq == other.freq) {
                return this.num - other.num; //  smaller Number is put at the top
            }
            return this.freq - other.freq; // smaller frequency is given preference
        }
    }

}
