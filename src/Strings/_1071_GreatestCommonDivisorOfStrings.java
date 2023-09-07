package Strings;

/**
 * @author Ahmed Nabil
 */
public class _1071_GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() > str2.length()) return gcdUtil(str2, str1);
        return gcdUtil(str1, str2);
    }

    private String gcdUtil(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        for(int i = s1.length(); i>0; i--) {
            String base = s1.substring(0, i);
            if(isBase(base, s1) && isBase(base, s2)) return base;
        }
        return "";
    }

    private boolean isBase(String base, String str) {
        if(str.length() % base.length() > 0) return false;
        String s = "";
        for(int j=1; j * base.length() <= str.length() ; j++) {
            s = s.concat(base);
        }
        return s.equals(str);
    }
}
