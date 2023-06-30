package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _30_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        // since all words are of the same length, we can slide window by words[0].length
        // since generating all perms is slow, we will have a map to check all has been included
        // we can make use of the fact that words.length * words[0].length = ss.length so
        // => each word must be in words && each word must occur once
        Map<String, Integer> count = new HashMap<>();
        for(String word: words) count.put(word, count.getOrDefault(word, 0)+1);
        int wordLen = words[0].length(), len = words.length*words[0].length();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<s.length() - len + 1; i++) {
            Map<String, Integer> found = new HashMap<>();
            int j = i;
            for(; j<i+len; j+=wordLen) {
                String ss = s.substring(j, j+wordLen);
                if(found.getOrDefault(ss, 0) >= count.getOrDefault(ss, 0)) {
                    break;
                }
                found.put(ss, found.getOrDefault(ss, 0) + 1);
            }
            if(j == i + len) {
                result.add(i);
            }
        }
        return result;
    }
}
