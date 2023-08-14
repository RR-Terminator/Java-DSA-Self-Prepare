package HeapsAndPQ;

import java.util.ArrayList;

public class HeapImplementation {

    public static void main(String[] args) {

        Heap h = new Heap();
        h.add(1);
        h.add(3);
        h.add(2);
        h.add(5);

        while (!h.isEmpty()){
            System.out.print(h.remove() + " ");
        }

    }

    public static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding element in A heap:-

        //Time Complexity O(log n)

        public void add(int data) {
            list.add(data);
            int childIndex = list.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            while (list.get(childIndex) < list.get(parentIndex)) {
                // Swap
                int temp = list.get(parentIndex);
                list.set(childIndex, parentIndex);
                list.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }
        }

        // Peek Element in an Heap :-
        // Time Complexity O(1);
        public int peek() {
            return list.get(0);
        }

        public int remove() {
            int data = list.get(0);

            int temp = list.get(0);
            list.set( 0, list.get(list.size() - 1));
            list.set(list.size() - 1, temp);
            list.remove(list.size() - 1);

            heapfiy(0);
            return data;
        }

        private void heapfiy(int i) {
            int lc = 2 * i + 1;
            int rc = 2 * i + 2;
            int minIdx = i;

            if (lc < list.size() && list.get(minIdx) > list.get(lc)) minIdx = lc;
            if (rc < list.size() && list.get(minIdx) > list.get(rc)) minIdx = rc;
            if (minIdx != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);
                heapfiy(minIdx);
            }
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }

    }
}
