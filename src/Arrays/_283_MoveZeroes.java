package Arrays;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        // insert non zero values from the beginning
        int pos = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }
        // fill the rest with 0's
        Arrays.fill(nums, pos, nums.length, 0);
    }
}
