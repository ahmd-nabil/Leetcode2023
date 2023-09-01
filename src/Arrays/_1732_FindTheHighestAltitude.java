package Arrays;

/**
 * @author Ahmed Nabil
 */
public class _1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int cur = 0, max = 0;
        for(int g: gain) {
            cur += g;
            max = Math.max(cur, max);
        }
        return max;
    }
}
