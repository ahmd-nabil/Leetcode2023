package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _896_MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] > nums[i]) increasing = true;
            if (nums[i+1] < nums[i]) decreasing = true;
            if (increasing && decreasing) return false;
        }

        return true;
    }
}
