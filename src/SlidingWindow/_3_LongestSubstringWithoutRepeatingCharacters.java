package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start=0, end=0; end < s.length(); end++) {
            if(map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1); // max because for example "tmmzuxt" at last character t without max you will get back to index 1 and contains two m 's
            }
            map.put(s.charAt(end), end);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
