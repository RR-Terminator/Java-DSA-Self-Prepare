package Queue;

// Queue HeapImplementation Using Linked List

import static Queue.LinkedList.Queue.add;

public class LinkedList {

    public static class Node{
        int Data ;
        Node next;

        public Node(int data) {
            this.Data = data;
            this.next = null;
        }
    }

    public static class Queue{

        static Node head;
         static Node tail;

         public static boolean isEmpty(){
             return head == null && tail == null;
         }

         public static void add(int data){
             Node node  = new  Node(data) ;
             if (head == null) {
                 head = node;
                 tail = head;
             }
             tail.next = node;
             tail = node;
         }

         public static int Remove(){
             if(isEmpty()){
                 System.out.println(" Queue is Empty can't Remove");
                 return -1;
             }
             int front  =head.Data;

             if (head == tail) {
                 head = tail = null;
             }
             else   head = head.next;
             return  front;

         }

         public static int peek(){
             return head.Data;
         }

        public static void main(String[] args) {
            Queue queue  = new Queue();
            add(1);
            add(2);
            add(3);

            while (!isEmpty()){
                System.out.print(peek() + " ");
                Remove();
            }





        }



    }




}
