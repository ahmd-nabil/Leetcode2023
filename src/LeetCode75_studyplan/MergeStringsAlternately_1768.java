package LeetCode75_studyplan;

/**
 * @author Ahmed Nabil
 */
public class MergeStringsAlternately_1768 {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j=0;
        StringBuilder sb = new StringBuilder();
        while(i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        if(i < word1.length()) sb.append(word1.substring(i));
        if(j < word2.length()) sb.append(word2.substring(j));
        return sb.toString();
    }
}
