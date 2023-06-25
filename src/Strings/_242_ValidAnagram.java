package Strings;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];
        for(char c : s.toCharArray())
            counter[c - 'a']++;
        for(char c: t.toCharArray())
            counter[c - 'a']--;
        return Arrays.stream(counter).allMatch(c -> c == 0);
    }
}
