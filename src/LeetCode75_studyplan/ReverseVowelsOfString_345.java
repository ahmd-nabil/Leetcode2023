package LeetCode75_studyplan;

/**
 * @author Ahmed Nabil
 */
public class ReverseVowelsOfString_345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while(l < r) {
            while(l < chars.length && !isVowel(chars[l])) l++;
            while(r >= 0 && !isVowel(chars[r])) r--;
            if(l < r) {
                swap(chars, l ,r);
                l++;
                r--;
            }
        }
        return String.valueOf(chars);
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u' ||
                c == 'A' || c == 'E' || c == 'I'|| c == 'O'|| c == 'U';
    }

    void swap(char[] chars, int l, int r) {
        char tmp = chars[l];
        chars[l] = chars[r];
        chars[r] = tmp;
    }
}
