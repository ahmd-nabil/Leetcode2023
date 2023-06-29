package BinarySearch;

/**
 * @author Ahmed Nabil
 */
public class _441_ArrangingCoins {
    public int arrangeCoins(int n) {
        long l = 0, r = n;
        while(l <= r) {
            long k = (l + r) / 2;
            long curr = k * (k + 1) / 2;
            if(curr == n) return (int) k;
            else if(curr > n) r = k - 1;
            else l = k + 1;
        }
        return (int) r;
    }
}
