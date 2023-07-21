package Strings;

/**
 * @author Ahmed Nabil
 */
public class _5_LongestPalindromicSubstring {
    private int start = -1;
    private int length = -1;
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0; i<n ; i++) {
            longestPalindrome(i, i, s);
            longestPalindrome(i, i+1, s);
        }
        return s.substring(this.start, this.start+this.length);
    }
    private void longestPalindrome(int i, int j, String s) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if(this.length < j - i + 1) {
                this.start = i;
                this.length = j-i+1;
            }
            i--; j++;
        }
    }
}
