package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, int[] nums, List<Integer> cur, boolean[] visited) {
        if(cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                cur.add(nums[i]);
                backtrack(ans, nums, cur, visited);
                visited[i] = false;
                cur.remove(cur.size()-1);
            }
        }
    }
}
