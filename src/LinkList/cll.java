package LinkList;

public class cll {
    
    private Node head;
    private Node tail;

    public cll() {
        this.head = head;
        this.tail = tail;
    }
    
    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node =  head;
        if (head != null) {
            do{
                System.out.print(node.value + " ->");
                node = node.next;
            }
            while (node!=head);
        }
        System.out.println("End");
    }

    private  class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
}
