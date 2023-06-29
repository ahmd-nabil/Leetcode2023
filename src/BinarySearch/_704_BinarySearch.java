package BinarySearch;

/**
 * @author Ahmed Nabil
 */
public class _704_BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(target < nums[m]) r = m - 1;
            else if(target > nums[m]) l = m + 1;
            else return m;
        }
        return -1;
    }
}
