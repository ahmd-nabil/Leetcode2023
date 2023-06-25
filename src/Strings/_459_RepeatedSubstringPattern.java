package Strings;

/**
 * @author Ahmed Nabil
 */
public class _459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        for(int j=1; j <= s.length()/2; j++) {
            String substring = s.substring(0, j);
            int repetitions = s.length() / j;
            if(repetitions * j != s.length()) continue;
            StringBuilder sb = new StringBuilder();
            while(repetitions-- > 0) {
                sb.append(substring);
            }
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}
