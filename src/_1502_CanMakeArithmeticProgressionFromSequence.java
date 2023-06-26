import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _1502_CanMakeArithmeticProgressionFromSequence {

    // sorting
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 2) return true;
        int diff = Math.abs(arr[0] - arr[1]);
        for(int i=1; i<arr.length; i++) {
            if(Math.abs(arr[i] - arr[i-1]) != diff) return false;
        }
        return true;
    }

    // Set, and Math
    public boolean canMakeArithmeticProgression2(int[] arr) {
        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i: arr) {
            maxValue = Math.max(maxValue, i);
            minValue = Math.min(minValue, i);
            set.add(i);
        }
        if(maxValue - minValue == 0) return true;
        if(set.size() != arr.length) return false;
        if((maxValue - minValue) % (arr.length - 1) != 0) return false;
        int diff = (maxValue - minValue) / (arr.length - 1);
        for(int i: arr) {
            if((i-minValue) % diff != 0) return false;
        }
        return true;
    }
}
