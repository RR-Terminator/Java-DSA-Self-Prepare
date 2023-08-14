package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeave {
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<>();
        for (int i = 1 ; i <= 10 ; i++){
            q.add(i);

        }

        interleave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

    }

    public static void interleave(Queue<Integer> queue){
        int size = queue.size();
        Queue<Integer> half = new LinkedList<>();

        for (int i = 0; i < size/2; i++) {
            half.add(queue.remove());
        }

        while(!half.isEmpty()){
            queue.add(half.remove());
            queue.add(queue.remove());
        }
    }
}
