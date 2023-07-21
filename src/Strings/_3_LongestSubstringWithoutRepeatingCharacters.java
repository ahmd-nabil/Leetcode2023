package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, ans = 0, n = s.length();
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        for(int end = 0; end < n; end++) {
            Integer last = lastOccurrence.put(s.charAt(end), end);
            if(last != null) {
                start = Math.max(start, last+1);
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
