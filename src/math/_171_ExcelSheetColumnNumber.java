package math;

/**
 * @author Ahmed Nabil
 */
public class _171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        for(int i=0; i < n; i++) {
            ans += Math.pow(26, i) * (columnTitle.charAt(n - i - 1) - 'A' + 1);
        }
        return ans;
    }

    public int titleToNumber_optimized(String s) {
        int ans = 0;
        for(char c : s.toCharArray()) {
            ans *= 26;
            ans += c - 'A' + 1;
        }
        return ans;
    }
}
