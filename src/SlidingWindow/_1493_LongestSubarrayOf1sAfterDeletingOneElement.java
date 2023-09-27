package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _1493_LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int l = 0, r = 0, ans = 0, zeros = 0;
        while(r < nums.length) {
            if(nums[r] == 0) zeros++;
            if(zeros > 1) {
                while(nums[l] != 0) l++;
                zeros--; l++;
            }
            ans = Math.max(ans, r - l);
            r++;
        }
        return ans;
    }
}
