package Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> loop = new HashSet<>();
        while(!loop.contains(n)) {
            loop.add(n);
            int sum = 0, digit = 0;
            while(n > 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if(n == 1) return true;
        }
        return false;
    }
}
