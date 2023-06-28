package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _1876_SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for(int start = 0; start < s.length() - 2; start++){
            if(s.charAt(start) != s.charAt(start+1)
                    && s.charAt(start) != s.charAt(start + 2)
                    && s.charAt(start+1) != s.charAt(start+2)) {
                ans++;
            }
        }
        return ans;
    }
}
