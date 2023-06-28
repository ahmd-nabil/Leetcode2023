package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _2379_MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String s, int k) {
        int ans = 0;
        for(int i=0; i<k; i++) {
            if(s.charAt(i) == 'W') ans++;
        }
        int cur = ans;
        for(int start=0; start < s.length() - k; start++) {
            if(s.charAt(start) == 'B' && s.charAt(start+k) == 'W') {
                cur++;
            } else if (s.charAt(start) == 'W' && s.charAt(start+k) == 'B') {
                cur--;
                ans = Math.min(ans, cur);
            }
        }
        return ans;
    }
}
