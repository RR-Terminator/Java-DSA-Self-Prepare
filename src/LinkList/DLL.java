package LinkList;

public class DLL {

    //Inserting in the DLL From Start :-

    public void insertFirst( int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    // Inserting From last

    public void insertLast(int val){
        Node node = new Node(val);
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
       Node temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }

       temp.next = node;
       node.prev = temp;
       node.next = null;
    }


    // inserting After Particular Element

    public Node find(int target){
        DLL.Node node = head;
        while (node !=null){
            if (node.value == target) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after , int value){
        Node p = find(after);
        if (p == null) {
            System.out.println("node Doest exist");
            return;
        }
        Node node = new Node(value);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


    public void insertQ(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    // Deleting from Start

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        head.prev = null;
        return value;
    }

    //Deleting From The Last
    public void deleteLast(){
        Node temp = head;

        while (temp.next!=null){
            temp = temp.next;

        }
        temp.prev.next= null;

            }

    // Displaying The Double Linked List;-
    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    // Head;-
    private  Node head;
    // Doubly Linked List Node Class
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
