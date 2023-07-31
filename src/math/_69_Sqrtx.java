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
}
