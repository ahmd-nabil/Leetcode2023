package DynamicProgramming;
import java.util.Arrays;
/**
 * @author Ahmed Nabil
 */
public class _300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] A) {
        // all indexes hav lis of 1
        // at each index search prev indexes for cur > prev then max(dp[cur - prev] + 1)

        int[] llis = new int[A.length];
        int ans = 1;
        Arrays.fill(llis, 1);
        for(int i = 1; i<A.length; i++) {
            for(int j=0; j<i; j++) {
                if(A[i] > A[j]) {
                    llis[i] = Math.max(llis[i], llis[j] + 1);
                }
            }
            ans = Math.max(ans, llis[i]);
        }
        return ans;
    }
}
