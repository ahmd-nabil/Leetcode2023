package BinarySearch;

/**
 * @author Ahmed Nabil
 */
public class _367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while(l <= r) {
            int sqrt = l + (r - l) / 2;
            long product = (long)sqrt * sqrt;
            if(product > num) r = sqrt - 1;
            else if(product < num) l = sqrt + 1;
            if(product == num) return true;
        }
        return false;
    }
}
