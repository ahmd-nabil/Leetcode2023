package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(counter.get(c) == 0)
                return c;
            counter.put(c, counter.get(c) - 1);
        }
        return '-';
    }

    public char findTheDifferenceOptimized(String s, String t) {
        int sumT = 0, sumS = 0;
        for(char c: t.toCharArray()) {
            sumT += c;
        }
        for(char c: s.toCharArray()) {
            sumS += c;
        }

        return (char) (sumT - sumS);
    }

    public char findTheDifferenceOptimizedBitManipulation(String s, String t) {
        char x = 0;
        for(char c : s.toCharArray()) x ^= c;
        for(char c : t.toCharArray()) x ^= c;
        return x;
    }
}
