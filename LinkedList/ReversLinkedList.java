package LinkedList;// Name: Yuxin Wu (Peter Wu)

/*public class ListNode {
    public int value;
    public ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}*/

import java.util.List;
public class ReversLinkedList {
    public static void main(String[] args) {
        ReversLinkedList testLinkedList = new ReversLinkedList();
        ListNode head = new ListNode(1);
        ListNode origHead = head;
        for (int i = 2; i < 7; ++i) {
            ListNode newNode = new ListNode(i);
            origHead.next = newNode;
            origHead = newNode;
        }

        ListNode result = testLinkedList.recursive(head);
        //ListNode result = testLinkedList.reverse(head);
        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    // Reverse Linkedlist iterattively
//    public ListNode reverse(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode prev = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        return prev;
//    }

    // Reverse Linkedlist recursively
    public ListNode recursive(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
