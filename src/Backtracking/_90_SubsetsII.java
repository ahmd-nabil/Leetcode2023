package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _90_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, int start, List<Integer> cur, List<List<Integer>> ans, boolean[] visited) {
        ans.add(new ArrayList<>(cur));
        for(int i=start; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            cur.add(nums[i]);
            visited[i] = true;
            backtrack(nums, i+1, cur, ans, visited);
            cur.remove(cur.size() - 1);
            visited[i] = false;
        }
    }
}
