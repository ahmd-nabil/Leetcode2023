package Strings;

/**
 * @author Ahmed Nabil
 */
public class _392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        for(; i<t.length() && j < s.length(); i++) {
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }
        if(j == s.length()) return true;
        return false;
    }
}
