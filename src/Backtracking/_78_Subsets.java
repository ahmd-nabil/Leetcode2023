package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _78_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int x: nums) {
            int size = ans.size();
            for(int i=0; i<size; i++) {
                List<Integer> cur = new ArrayList<>(ans.get(i));
                cur.add(x);
                ans.add(cur);
            }
        }
        return ans;
    }
    public List<List<Integer>> subsets_bitManipulation(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            ans.add(curr);
        }
        return ans;
    }
}
