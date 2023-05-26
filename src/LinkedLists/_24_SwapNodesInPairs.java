package LinkedLists;

import shared.ListNode;

/**
 * @author Ahmed Nabil
 */
public class _24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while(head != null && head.next != null) {
            ListNode tmp = head.next;
            head.next = head.next.next;
            tmp.next = head;
            prev.next = tmp;

            prev = head;
            head = head.next;
        }
        return dummy.next;
    }
}
