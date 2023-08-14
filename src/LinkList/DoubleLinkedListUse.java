package LinkList;

public class DoubleLinkedListUse {
    public static void main(String[] args) {
        DLL list  = new DLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.insert(5,7);
        list.display();
        list.insert(6,7);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        list.deleteLast();
        list.display();
    }
}
