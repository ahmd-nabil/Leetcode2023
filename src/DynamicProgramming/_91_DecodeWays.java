package DynamicProgramming;

/**
 * @author Ahmed Nabil
 */
public class _91_DecodeWays {
    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()];
        return numDecodings(s, 0, dp);
    }
    private int numDecodings(String s, int p, Integer[] dp) {
        int n = s.length();
        if(p == n) {
            return 1;
        }
        if(s.charAt(p) == '0') {
            return 0;
        }
        if(dp[p] != null) return dp[p];
        int branch1 = numDecodings(s, p+1, dp);
        int branch2 = 0;
        if(p+1 < n && Integer.parseInt(s.substring(p, p+2)) <= 26)
            branch2 = numDecodings(s, p+2, dp);
        return dp[p] = branch1 + branch2;
    }
}
