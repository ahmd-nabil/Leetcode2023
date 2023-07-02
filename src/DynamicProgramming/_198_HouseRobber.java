package DynamicProgramming;

/**
 * @author Ahmed Nabil
 */
public class _198_HouseRobber {
    public int rob(int[] A) {
        if(A.length == 1) return A[0];
        int[] dp = new int[A.length];
        dp[0] = A[0];
        dp[1] = Math.max(A[0], A[1]);
        for(int i=2; i<A.length; i++) {
            dp[i] = Math.max(A[i]+dp[i-2], dp[i-1]);
        }
        return dp[A.length - 1];
    }
}
