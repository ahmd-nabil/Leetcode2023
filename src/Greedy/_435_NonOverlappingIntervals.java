package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ahmed Nabil
 */
public class _435_NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        int curEnd = intervals[0][1];   // first end
        int maxConcurrent = 1;
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] >= curEnd) {
                maxConcurrent++;
                curEnd = intervals[i][1];
            }
        }
        return intervals.length - maxConcurrent;
    }
}
