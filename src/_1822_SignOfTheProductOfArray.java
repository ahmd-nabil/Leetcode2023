/**
 * @author Ahmed Nabil
 */
public class _1822_SignOfTheProductOfArray {
    public int arraySign(int[] nums) {
        int result = 1;
        for(int x: nums) {
            if(x == 0) return 0;
            if(x < 0) result*=-1;
        }
        return result;
    }
}
