package Trees;

import shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if(root == null) return;
        if(root.left != null) postorder(root.left, result);
        if(root.right != null) postorder(root.right, result);
        result.add(root.val);
    }
}
