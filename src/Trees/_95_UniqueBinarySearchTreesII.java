package Trees;

import shared.Pair;
import shared.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _95_UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        Map<Pair<Integer, Integer>, List<TreeNode>> memo = new HashMap<>();
        return allPossibleBST(1, n, memo);
    }

    private List<TreeNode> allPossibleBST(int start, int end, Map<Pair<Integer, Integer>, List<TreeNode>> memo) {
        List<TreeNode> result = new ArrayList<>();
        if(start > end) {
            result.add(null);
            return result;
        }
        if(memo.containsKey(new Pair<>(start, end))) {
            return memo.get(new Pair<>(start, end));
        }

        for(int i=start; i<=end; i++) {
            List<TreeNode> leftSubTrees = allPossibleBST(start, i-1, memo);
            List<TreeNode> rightSubTrees = allPossibleBST(i+1, end, memo);
            for(TreeNode left: leftSubTrees) {
                for(TreeNode right: rightSubTrees) {
                    TreeNode root = new TreeNode(i, left, right);
                    result.add(root);
                }
            }
        }
        return result;
    }
}
