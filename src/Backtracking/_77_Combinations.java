package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), n, k, 1);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans, List<Integer> cur, int n, int k, int start) {
        if(cur.size() == k) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start; i<=n; i++) {
            cur.add(i);
            backtrack(ans, cur, n, k, i+1);
            cur.remove(cur.size()-1);
        }
    }
}
