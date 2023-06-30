package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        while(end < nums.length) {
            while(end < nums.length && sum < target) {
                sum += nums[end++];
            }
            while(sum >= target) {
                minLength = Math.min(minLength, end - start);
                sum -= nums[start++];
            }
        }
        return minLength == Integer.MAX_VALUE? 0 : minLength;
    }
}
