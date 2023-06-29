package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ahmed Nabil
 */
public class _350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int x: nums1) map1.put(x, map1.getOrDefault(x, 0) + 1);

        List<Integer> resultList = new ArrayList<>();
        for(int x: nums2) {
            int counter = map1.getOrDefault(x, 0);
            if(counter > 0) {
                resultList.add(x);
                map1.put(x, counter - 1);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
