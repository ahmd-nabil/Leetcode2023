package LeetCode75_studyplan;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class ReverseWordsInString_151 {
    public String reverseWords(String s) {
        List<String> cleanWords = Arrays.stream(s.split(" ")).map(String::strip).filter(s1 -> !s1.isBlank()).toList();
        int n = cleanWords.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++){
            sb.append(cleanWords.get(n - i - 1)).append(" ");
        }
        return sb.toString().strip();
    }
}
