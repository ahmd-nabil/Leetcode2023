package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _2269_FindTheKBeautyOfNumber {
    public int divisorSubstrings(int num, int k) {
        int ans = 0;
        String s = String.valueOf(num);
        for(int start=0; start <= s.length() - k; start++) {
            int test = Integer.parseInt(s.substring(start, start+k));//has length of k
            if(test == 0) continue;
            if(num % test == 0) ans++;  // divisor of num
        }
        return ans;
    }
}
