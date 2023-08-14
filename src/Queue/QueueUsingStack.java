package Queue;

import java.util.Stack;

// Implementing  Queue Using 2 Stacks :-
// Time Complexity To add Elements in the Stack O(n)
// To remove O(1)
// Peek O(1)
public class QueueUsingStack {

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int Remove() {
            return s1.pop();
        }

        public static int top() {
            return s1.peek();
        }

        public static void main(String[] args) {

            Queue queue = new Queue();

            queue.add(1);
            queue.add(2);
            queue.add(3);

            while (!queue.isEmpty()) {
                System.out.print(queue.top() + " ");
                queue.Remove();
            }


        }

    }

}
