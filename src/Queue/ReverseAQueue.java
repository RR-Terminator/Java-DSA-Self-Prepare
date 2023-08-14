package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {

        Queue<Integer> queue  = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }
        reverseQueue(queue);
        System.out.println(queue);

    }

    // Recursive Approach

    public static void reverseQueue(Queue<Integer> input){
        if (input.size() == 0 || input.size() == 1) return ;
        int val = input.poll();
        reverseQueue(input);
        input.offer(val);
    }


//    public static void reverseQueue(Queue<Integer> input) {
//        Stack<Integer> stack = new Stack<>();
//        while(!input.isEmpty()){
//            stack.push(input.poll());
//        }
//        while(!stack.isEmpty()){
//            input.offer(stack.pop());
//        }
//    }
}
