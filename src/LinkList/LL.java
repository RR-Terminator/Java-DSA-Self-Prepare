package LinkList;

public class LL {

    static Node head;
    static Node tail;

    static int size;

    public LL() {
        this.size = 0;
    }

    void insertFirst(int val) {
        Node node = new Node(val);

        if (head == null && tail == null) {
            head = tail = node;
            size++;
        }

        node.next = head;
        head = node;
        size++;
    }

    static int deleteFromLast() {
        Node temp = head;

        if (head == tail) {
            int ans = tail.data;
            head = tail = null;
            System.out.println("Last Node was Deleted");
            return ans;
        }

        while (temp.next != tail) {
            temp = temp.next;
        }
        int deletedNode = tail.data;
        tail = temp;
        temp.next = null;

        return tail.data;

    }

    // Inserting Elements Form The Start

    static int deleteFromFirst() {
        int ans;

        if (head == tail) {
            ans = head.data;
            head = tail = null;
            System.out.println("LastNode Was Deleted");
            return ans;
        }
        ans = head.data;
        head = head.next;
        return ans;

    }

    //deleting  Node from last

    static void insertAtIndex(int val, int index) {
        Node node = new Node(val);
        Node temp = head;
        int curr_index = 1;
        while (curr_index != index - 1) {
            temp = temp.next;
            curr_index++;
        }
        //reached at  inserting  position

        node.next = temp.next;
        temp.next = node;

    }

    // delete From Beginning




    // inserting the Element at last
    void insertLast(int data) {
        Node node = new Node(data);

        if (head == null && tail == null) {
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    static void deleteAtIndex(Node head, int x) {
        if (x == 1) {
            head = head.next;
            return;
        }
        // reach till x-1 place;
        int curr_pos = 1;
        Node node = head;
        while (curr_pos != x - 1) {
            node = node.next;
            curr_pos++;
        }
        //reached x-1 place
        if (node.next != null) {
            node.next = node.next.next;
        } else node.next = null;
    }


    // Finding the Middle of the LinkedList

    static Node middleNode(Node head){
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }

    
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        for (int i = 0; i < 5; i++) {
            list.insertLast(i); // Pass the data parameter to insertLast method
        }
        LL.printList(head);
//        System.out.println("Deleted Node is " +   list.deleteFromLast());
//        temp = head;
//        while (temp !=null ){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//
//
//        System.out.println("NULL");
//
//        System.out.println("Deleted Node is " +   list.deleteFromFirst());
//        temp = head;
//        while (temp !=null ){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//
//        System.out.println("NULL");
//        LL.insertAtIndex(10, 5);
//        LL.printList(head);
//        LL.deleteAtIndex(head,3);
//        LL.printList(head);

        System.out.println("Middle of the LinkedList is " + middleNode(head).data);

    }









}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node() {
    }
}