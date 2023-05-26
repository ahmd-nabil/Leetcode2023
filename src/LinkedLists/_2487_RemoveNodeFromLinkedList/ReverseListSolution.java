package LinkedLists._2487_RemoveNodeFromLinkedList;

import shared.ListNode;

/**
 * @author Ahmed Nabil
 */
public class ReverseListSolution {
    public ListNode removeNodes(ListNode head) {
        head = reverseLinkedList(head);
        ListNode current = head;
        while(current != null) {
            while(current.next != null && current.next.val < current.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return reverseLinkedList(head);
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}
