package BinarySearch;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _268_MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] == mid) l = mid + 1;
            else if(nums[mid] > mid) r = mid-1;
        }
        return l;
    }

    public int missingNumber_BitManipulation(int[] nums) {
        int n = nums.length;
        int x = n;
        for(int i=0; i<n; i++) {
            x ^= i;
            x ^= nums[i];
        }
        return x;
    }
}
