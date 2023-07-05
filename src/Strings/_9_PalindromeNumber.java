package Strings;

/**
 * @author Ahmed Nabil
 */
public class _9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for(int i=0; i< n / 2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }

    public boolean isPalindrome_withoutConvertingToString(int x) {
        if(x < 0) return false;
        int same = x;
        int rev = 0;
        while(same != 0) {
            rev = rev * 10 + same % 10;
            same /= 10;
        }
        return x == rev;
    }
}
