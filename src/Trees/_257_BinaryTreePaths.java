package Trees;

import shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        dfs(root,String.valueOf(root.val), result);
        return result;
    }

    private void dfs(TreeNode root,String path, List<String> result) {
        if(root.left == null && root.right == null) result.add(path);
        if(root.left != null) {
            dfs(root.left, path + "->" + root.left.val, result);
        }
        if(root.right != null) {
            dfs(root.right, path + "->" + root.right.val, result);
        }
    }
}
