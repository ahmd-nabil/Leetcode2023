import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Nabil
 */
public class _888_FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        // alice gives x and gets y to reach middle point
        // sumA - x + y = sumB - y + x => 2y = 2x + (sumB - sumA) => y = x + (sumB-sumA)/2
        // for each x in A if y exists in B then return
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumB - sumA) / 2;

        Set<Integer> bSet = new HashSet<>();
        for(int b : B) bSet.add(b);
        for(int x : A) {
            int y = x + delta;
            if(bSet.contains(y)) return new int[]{x,y};
        }
        return new int[]{-1,-1};
    }
}
