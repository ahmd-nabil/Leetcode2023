package PrefixSum;

/**
 * @author Ahmed Nabil
 */
public class _1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int cur = 0, ans = 0;
        for(int g: gain) {
            cur += g;
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}
