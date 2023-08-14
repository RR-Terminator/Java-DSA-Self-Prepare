package Queue;

// This is the Circular Queue HeapImplementation


public class CircularQueue {

    static int [] arr;
    static int size;
    static int front;
    static int rear;

    public  CircularQueue(int n){
        arr = new int [n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isfull(){
        return (rear+1) % size == front;
    }

    public static void add(int n){
        if (isfull()) {
            System.out.println("Queue is Full Can't  add  More ");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear  = (rear+1)%size;
        arr[rear] = n;
    }
    
    public static int remove(){
        if (isEmpty()) {
            return -1;
        }
        
        int result = arr[front];

        if ( rear == front) {
            front = rear = -1;
        }
        else {
            front = (front+1)%size;
        }
        return result;
        
    }

    public static int peek(){
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(3);
        add(1);
        add(2);
        add(3);
        System.out.print(remove() + " ");
        add(4);
        System.out.print(remove() + " ");
        add(5);

        while ( !isEmpty()){
            System.out.print(peek() + " ");
            remove();
        }

    }
}
