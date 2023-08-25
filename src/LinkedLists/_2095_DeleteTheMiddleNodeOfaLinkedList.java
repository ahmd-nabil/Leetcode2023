package LinkedLists;

import shared.ListNode;

/**
 * @author Ahmed Nabil
 */
public class _2095_DeleteTheMiddleNodeOfaLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head, pre = head;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = slow.next;
        return head;
    }
}
