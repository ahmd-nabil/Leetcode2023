package PrefixSum;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int rSum = Arrays.stream(nums).sum() - nums[0];
        int lSum = 0;
        int i = 0;
        while(i < nums.length - 1){
            if(lSum == rSum) return i;
            lSum += nums[i++];
            rSum -= nums[i];
        }
        return lSum == rSum ? i : -1;
    }

    public int pivotIndex_2(int[] nums) {
        int sum  = Arrays.stream(nums).sum();
        int lSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(lSum == sum - lSum - nums[i]) return i;
            lSum += nums[i];
        }
        return -1;
    }
}
