package Strings;

/**
 * @author Ahmed Nabil
 */
public class _28_FindFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); i++) {
            if(i + needle.length() > haystack.length()) return -1;
            for(int j=0 ; ; j++) {
                if(j == needle.length()) return i;
                if(haystack.charAt(i+j) != needle.charAt(j)) break;
            }
        }
        return -1;
//        return haystack.indexOf(needle);    /* even better */
    }
}
