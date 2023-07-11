package Backtracking;

import java.util.*;

/**
 * @author Ahmed Nabil
 */
public class _17_LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<Character>> phoneMap = new HashMap<>() {{
            put('2', Arrays.asList('a','b','c'));
            put('3', Arrays.asList('d','e','f'));
            put('4', Arrays.asList('g','h','i'));
            put('5', Arrays.asList('j','k','l'));
            put('6', Arrays.asList('m','n','o'));
            put('7', Arrays.asList('p','q','r','s'));
            put('8', Arrays.asList('t','u','v'));
            put('9', Arrays.asList('w','x','y','z'));
        }};
        LinkedList<String> ans = new LinkedList<>();
        if(digits.isEmpty()) return ans;
        ans.add("");
        for(char d : digits.toCharArray()) {
            int sz = ans.size();
            while(sz-- > 0) {
                String s = ans.poll();
                for(char c : phoneMap.get(d)) {
                    ans.add(s+c);
                }
            }
        }
        return ans;
    }

    public List<String> letterCombinations_backtrack(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;
        Map<Character, List<Character>> phoneMap = new HashMap<>() {{
            put('2', Arrays.asList('a','b','c'));
            put('3', Arrays.asList('d','e','f'));
            put('4', Arrays.asList('g','h','i'));
            put('5', Arrays.asList('j','k','l'));
            put('6', Arrays.asList('m','n','o'));
            put('7', Arrays.asList('p','q','r','s'));
            put('8', Arrays.asList('t','u','v'));
            put('9', Arrays.asList('w','x','y','z'));
        }};
        backtrack(digits, new StringBuilder(digits.length()), res, phoneMap);
        return res;
    }
    private void backtrack(String digits, StringBuilder sb, List<String> res, Map<Character, List<Character>> phoneMap) {
        if(sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        char d = digits.charAt(sb.length());
        List<Character> chars = phoneMap.get(d);
        for(char c : chars) {
            sb.append(c);
            backtrack(digits, sb, res, phoneMap);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
