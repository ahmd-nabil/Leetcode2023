package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _2215_FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);

        for(int num: set1) {
            if(!set2.contains(num)) ans.get(0).add(num);
        }
        for(int num: set2) {
            if(!set1.contains(num)) ans.get(1).add(num);
        }
        return ans;
    }
}
