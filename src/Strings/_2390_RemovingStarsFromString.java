package Strings;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ahmed Nabil
 */
public class _2390_RemovingStarsFromString {
    public String removeStars_StackSolution(String s) {
        Deque<Character> q = new LinkedList<>();
        for(char c : s.toCharArray()) {
            if(c == '*') q.removeFirst();
            else q.addFirst(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()) {
            sb.append(q.removeLast());
        }
        return sb.toString();
    }

    public String removeStars_TwoPointers(String s) {
        char[] ans = new char[s.length()];
        int j = 0;
        for(char c: s.toCharArray()) {
            if(c == '*') {
                j--;
            } else {
                ans[j++] = c;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<j; i++) {
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}
