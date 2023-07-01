package Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        int bestStreak = 0;
        for(int start: nums) {
            int end = start;
            if(!set.contains(end-1)) {
                while(set.contains(end)){
                    end++;
                }
                bestStreak = Math.max(bestStreak, end - start);
            }
        }
        return bestStreak;
    }
}
