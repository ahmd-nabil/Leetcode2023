package Sets;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Ahmed Nabil
 */
public class _2336_SmallestNumberInInfiniteSet {
    class SmallestInfiniteSet {
        private SortedSet<Integer> added;
        private int cur;
        public SmallestInfiniteSet() {
            added = new TreeSet<>();
            cur = 1;
        }

        public int popSmallest() {
            int ans;
            if(!added.isEmpty()) {
                ans = added.first();
                added.remove(ans);
            } else {
                ans = cur++;
            }
            return ans;
        }

        public void addBack(int num) {
            // add only if less than cur, if equals or bigger => useless to add
            if(num < cur) {
                added.add(num);
            }
        }
    }
}
