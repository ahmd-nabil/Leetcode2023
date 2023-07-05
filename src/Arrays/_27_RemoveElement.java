package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = n-1;
        for(int i=0; i<=j; i++) {
            if(nums[i] == val) {
                nums[i--] = nums[j--];
            }
        }
        return j + 1;
    }
}
