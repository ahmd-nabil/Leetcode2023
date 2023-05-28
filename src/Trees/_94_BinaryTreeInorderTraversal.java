package Trees;

import shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if(root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}
