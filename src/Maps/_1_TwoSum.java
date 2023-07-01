package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToLoc = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            if(numToLoc.containsKey(target - num))
                return new int[] {i, numToLoc.get(target-num)};
            numToLoc.put(num, i);
        }
        return new int[]{-1,-1};
    }
}
