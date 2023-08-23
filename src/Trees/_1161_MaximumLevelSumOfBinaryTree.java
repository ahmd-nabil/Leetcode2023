package Trees;

import shared.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ahmed Nabil
 */
public class _1161_MaximumLevelSumOfBinaryTree {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        int lvlSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int lvl = 1, ans = 0;
        while(!q.isEmpty()) {
            for(int i=q.size(); i > 0; i--) {
                TreeNode node = q.removeFirst();
                lvlSum += node.val;
                if(node.left != null) q.addLast(node.left);
                if(node.right != null) q.addLast(node.right);
            }
            if(lvlSum > maxSum) {
                maxSum = lvlSum;
                ans = lvl;
            }
            lvlSum = 0;
            lvl++;
        }
        return ans;
    }
}
