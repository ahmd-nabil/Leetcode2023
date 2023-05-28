package Trees;

import shared.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ahmed Nabil
 */
public class _1609_EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        boolean even = true;
        Deque<TreeNode> Q = new LinkedList<>();
        Q.addFirst(root);
        while(!Q.isEmpty()) {
            int size = Q.size();
            int prev = even ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while(size-- > 0) {
                TreeNode cur = Q.removeLast();
                if(even && (cur.val <= prev || cur.val%2==0)) return false;
                if(!even && (cur.val >= prev || cur.val%2==1)) return false;
                prev = cur.val;
                if(cur.left != null) Q.addFirst(cur.left);
                if(cur.right != null) Q.addFirst(cur.right);
            }
            even = !even;
        }
        return true;
    }

    /**  Started HERE then simplified **/
//    public boolean isEvenOddTree(TreeNode root) {
//        int lvl = 0;
//        Deque<TreeNode> Q = new LinkedList<>();
//        Q.addFirst(root);
//        while(!Q.isEmpty()) {
//            int size = Q.size();
//            if(lvl % 2 == 0) {
//                int prev = Integer.MIN_VALUE;
//                while(size-- > 0) {
//                    TreeNode cur = Q.removeLast();
//                    if(cur.val % 2 == 0 || cur.val <= prev) return false;
//                    prev = cur.val;
//                    if(cur.left != null) Q.addFirst(cur.left);
//                    if(cur.right != null) Q.addFirst(cur.right);
//                }
//            } else {
//                int prev = Integer.MAX_VALUE;
//                while(size-- > 0) {
//                    TreeNode cur = Q.removeLast();
//                    if(cur.val % 2 == 1 || cur.val >= prev) return false;
//                    prev = cur.val;
//                    if(cur.left != null) Q.addFirst(cur.left);
//                    if(cur.right != null) Q.addFirst(cur.right);
//                }
//            }
//            lvl++;
//        }
//        return true;
//    }
}
