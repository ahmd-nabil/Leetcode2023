package DFS._802_FindEventualSafeStates;

import java.util.*;

/**
 * @author Ahmed Nabil
 */
public class ReverseEdgesSolution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // we have terminal nodes(no outgoing edges) => safe by default
        // graph represents node i ==outgoing edge=> graph[i]
        // so node i would be safe iff all outgoing edges are to safe nodes

        // G: outgoing === RG:Ingoing
        int n = graph.length;
        Map<Integer, Set<Integer>> G = new HashMap<>();
        Map<Integer, Set<Integer>> RG = new HashMap<>();
        for(int i=0; i<n; i++) {
            G.put(i, new HashSet<>());
            RG.put(i, new HashSet<>());
        }
        for(int u=0; u<n; u++) {
            for(int v: graph[u]) {
                G.get(u).add(v);
                RG.get(v).add(u);
            }
        }
        // if no Outgoing edges =>it's safe (add to queue) && add to resultList for return
        Deque<Integer> safeQueue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(G.get(i).isEmpty()) {
                safeQueue.addFirst(i);
                result.add(i);
            }
        }

        while(!safeQueue.isEmpty()) {
            int safe = safeQueue.removeLast();
            for(int u: RG.get(safe)) {
                G.get(u).remove(safe);              // remove safe node from outgoing edges
                if(G.get(u).isEmpty())  {           // if node U has 0 outgoing edges => it's safe
                    safeQueue.add(u);
                    result.add(u);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
