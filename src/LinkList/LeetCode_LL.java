package LinkList;

public class LeetCode_LL {
    public static void main(String[] args) {


    }

    public int  CycleLength(ListNode head) {

        if(head == null) return 0;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            int length = 0;
            if(fast == slow ){
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp!=fast);
                return length;
            }
        }
        return 0;
    }




    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }


//    public ListNode reverseBetween(ListNode head, int left, int right) {
//
//        if (left == right) {
//            return head;
//        }
//
//        ListNode current =  head;
//        ListNode prev = null;
//        for (int i = 0; current!=null &&i < left-1; i++) {
//            prev = current;
//            current = current.next;
//        }
//
//        ListNode last = prev;
//        ListNode newEnd = current;
//
//        ListNode next = current.next;
//        for (int i = 0; current != null && i < right - left +1; i++) {
//
//                current.next = prev;
//                prev = current;
//                current = next;
//                if (next != null) {
//                    next = next.next;
//                }
//            }
//            if (last != null) {
//                last.next = prev;
//            }
//            else head = prev;
//            newEnd.next = current;
//        }
//        return head;
//    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
           return head;
       }
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = null;

        for (int i = 0; current!=null &&i < left-1; i++) {
            prev = current;
            current = current.next;
        }
        for (int i = 0;  current != null && i < right -left +1; i++) {
            temp = current.next;
            prev.next = current.next;
            current.next = null;
            prev.next.next = temp;
        }



        return head;

    }


    public ListNode reverseList(ListNode head) {
        if(head == null ) return head;
        ListNode prev = null;
        ListNode present  = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }



    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
 }

