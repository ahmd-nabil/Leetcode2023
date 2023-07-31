package LinkedLists;

import shared.ListNode;

/**
 * @author Ahmed Nabil
 */
public class _328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode oddHead) {
        if(oddHead == null) return null;
        ListNode evenHead = oddHead.next, odd = oddHead, even = oddHead.next;
        while(even != null && even.next != null) {
            odd.next = even.next;
            even.next = odd.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
}
