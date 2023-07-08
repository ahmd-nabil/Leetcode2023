package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _1920_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
