package Stacks;

import java.util.Stack;

// This is the Linked List Base HeapImplementation oF the Stack :-
public class LinkedList {

    private Node head ;
    private Node top;

    private  int size = 0;

    public LinkedList() {
        this.size = 0;
    }

    // Pushing the Elements in the stack :-

    public void push(int val){
        Node node = new Node(val);
        if (head == null) {
               head= node ;
               top=head;
        }
        else {
            top.next = node;
            top = node;
        }
        size++;
    }
    // Popping the elements of the stack 
    
    public int pop(){
        if (head == null) {
            System.out.println("Noting left in stack to pop");
            return -1;
        }
        Node node =  head;
        while (node.next.next!=null){
            node = node.next;
        }
        int val = node.next.value;
        node.next = null;
        top = node;
        size--;
        return val;
    }
     
    
// Displaying the Data of the Stack:-
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("End");
        System.out.println("the size of the Stack is "+size);
        System.out.println("The Top of the stack is : " + top.value);
    }

    class Node{
        int value ;
        Node next;

       public Node(int value) {
           this.value = value;
       }
   }

    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        Stack<String> s= new Stack<>();

        
    }


}
