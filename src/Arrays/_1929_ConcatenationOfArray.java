package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i=0; i<n; i++) {
            ans[i] = ans[n+i] = nums[i];
        }
        return ans;
    }
}
