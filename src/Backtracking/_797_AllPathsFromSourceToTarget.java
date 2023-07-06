package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class _797_AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(graph, graph.length, new ArrayList<>(List.of(0)), ans);
        return ans;
    }

    private void backtrack(int[][] graph, int n, List<Integer> cur, List<List<Integer>> ans) {
        int u = cur.get(cur.size()-1);
        if (u == n-1) {
            ans.add(new ArrayList<>(cur));
        } else {
            int[] next = graph[u];
            for(int v : next) {
                cur.add(v);
                backtrack(graph, n, cur, ans);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
