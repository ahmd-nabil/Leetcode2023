package LinkedLists._143_ReorderList;

import shared.ListNode;

/**
 * @author Ahmed Nabil
 */
public class ReverseListSolution {
    public void reorderList(ListNode head) {
        // find mid-Node of the List
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode p1 = head;
        // Reverse second half
        ListNode p2 = reverse(slow.next);
        slow.next = null;
        // Reconnection 1 from first half to 1 from second half
        while(p1 != null && p2 != null) {
            ListNode tmp = p1.next;
            p1.next = p2;
            p2 = p2.next;
            p1.next.next = tmp;
            p1 = tmp;
        }
    }

    private ListNode reverse(ListNode cur) {
        ListNode prev = null;
        while(cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }
}
