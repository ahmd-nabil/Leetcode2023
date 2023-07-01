package Maps;

/**
 * @author Ahmed Nabil
 */
public class _290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] match = new String[26];
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if(match[c - 'a'] != word) return false;
            match[c - 'a'] = word;
        }
        return true;
    }
}
