package Trees;

import shared.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        boolean l2r = true;
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while(!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> cur = new ArrayList<>();
            while(size-- > 0) {
                if(l2r) {
                    TreeNode node = deque.removeFirst();
                    cur.add(node.val);
                    if(node.left != null) deque.addLast(node.left);
                    if(node.right != null) deque.addLast(node.right);
                } else {
                    TreeNode node = deque.removeLast();
                    cur.add(node.val);
                    if(node.right != null) deque.addFirst(node.right);
                    if(node.left != null) deque.addFirst(node.left);
                }
            }
            result.add(cur);
            l2r = !l2r;
        }
        return result;
    }
}
