package DynamicProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] canSegment = new boolean[n+1];
        canSegment[0] = true;
        for(int i=1; i<=n; i++) { // i is the length I am testing
            for(int j=0; j<i; j++) { // j is the index
                if(canSegment[j] && set.contains(s.substring(j, i))) {
                    canSegment[i] = true;
                    break;
                }
            }
        }
        return canSegment[n];
    }
}
