package math;

/**
 * @author Ahmed Nabil
 */
public class _50_Pow {
    public double myPow(double x, long n) {
        if(n == 0) return 1;
        if(n < 0) return myPow(1/x, -n);
        if(n % 2 == 1) return x * myPow(x * x, (n-1)/2);
        else return myPow(x * x, n/2);
    }
}
