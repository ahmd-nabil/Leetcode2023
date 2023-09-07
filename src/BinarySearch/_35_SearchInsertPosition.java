package BinarySearch;

/**
 * @author Ahmed Nabil
 */
public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int m = (r - l) / 2 + l;
        while(l < r) {
            if(target == nums[m]) return m;
            if(target > nums[m]) l = m + 1;
            else r = m;
            m = (r - l) / 2 + l;
        }
        return target > nums[m] ? m+1 : m;
    }
}
