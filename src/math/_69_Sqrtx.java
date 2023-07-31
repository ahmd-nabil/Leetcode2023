package math;

/**
 * @author Ahmed Nabil
 */
public class _69_Sqrtx {
    public int mySqrt(long x) {
        int ans = 0;
        while((long)ans * ans <= x) {
            ans++;
        }
        return ans - 1;
    }

    public int mySqrt_binSearch(int x) {
        if(x == 0) return 0;
        int l = 1, r = x;
        while(true) {
            int m =  l + (r-l)/2;
            if(m > x / m) {
                r = m - 1;
            } else if (m + 1 > x / (m+1)) {
                return m;
            }
            else {
                l = m + 1;
            }
        }
    }
}
