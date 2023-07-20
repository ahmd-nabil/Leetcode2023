package Strings;

/**
 * @author Ahmed Nabil
 */
public class _344_ReverseString {
    public void reverseString(char[] s) {
        int l = 0, r = s.length-1;
        while(l < r) {
            s[l] ^= s[r];
            s[r] ^= s[l];
            s[l++] ^= s[r--];
        }
    }
}
