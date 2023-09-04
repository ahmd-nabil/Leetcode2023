package PrefixSum;

/**
 * @author Ahmed Nabil
 */
public class _238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        left[0] = 1;
        for(int i=1; i<len; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        int[] right = new int[len];
        right[len-1] = 1;
        for(int i=len-2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i=0; i<len; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }

    public int[] productExceptSelf_optimized(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        left[0] = 1;
        for(int i=1; i<len; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=len-2; i>=0; i--) {
            right = right * nums[i+1];
            left[i] = left[i] * right;
        }
        return left;
    }
}
