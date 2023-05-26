package LinkedLists._2487_RemoveNodeFromLinkedList;

import shared.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ahmed Nabil
 */
public class StackSolution {
    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        while(head != null) {
            while(!stack.isEmpty() && head.val > stack.peekFirst().val) {
                stack.removeFirst();
            }
            if(!stack.isEmpty()) {
                stack.peekFirst().next = head;
            }
            stack.addFirst(head);
            head = head.next;
        }
        return stack.peekLast();
    }
}
