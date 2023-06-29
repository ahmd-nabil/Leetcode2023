package BinarySearch;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int x: nums1) set1.add(x);

        Set<Integer> resultSet = new HashSet<>();
        for(int x: nums2) {
            if(set1.contains(x)) resultSet.add(x);
        }
        int[] result = new int[resultSet.size()];
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
