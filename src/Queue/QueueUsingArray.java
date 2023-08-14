package Queue;

import static Queue.QueueUsingArray.Queue.*;

public class QueueUsingArray {

    static class Queue{
        static int [] arr;
        static int size;
        
        static int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }


        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int n){

            if (rear == size-1) {
                System.out.println("Queue is Full Can't load Elements ");
                return;
            }

            rear = rear+1;
            arr[rear] = n;

        }

        public static int Delete(){
            if (isEmpty()) {
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        public static int peek(){
            return arr[0];
        }


    }



    public static void main(String[] args) {
        Queue q = new Queue(3);
        add(1);
        add(2);
        add(3);
        add(4);

        while (!isEmpty()){
            System.out.println(peek());
            Delete();
        }
    }
    

}
