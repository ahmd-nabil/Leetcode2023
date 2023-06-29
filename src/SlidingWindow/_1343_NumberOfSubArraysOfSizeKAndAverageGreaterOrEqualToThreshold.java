package SlidingWindow;

/**
 * @author Ahmed Nabil
 */
public class _1343_NumberOfSubArraysOfSizeKAndAverageGreaterOrEqualToThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(k > arr.length) return 0;
        double sumThreshold = threshold * k;
        double windowSum = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            windowSum += arr[i];
            if(i >= k-1) {
                if(windowSum >= sumThreshold) ans++;
                windowSum -= arr[i-k+1];
            }
        }
        return ans;
    }
}
