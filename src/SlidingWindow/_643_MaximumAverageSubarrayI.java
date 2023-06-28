package SlidingWindow;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _643_MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Arrays.stream(nums, 0, k).sum();
        double maxSum = sum;
        for(int i=0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i+k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}
