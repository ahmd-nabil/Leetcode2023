package BinarySearch;

/**
 * @author Ahmed Nabil
 */
public class _374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while(l <= r) {
            int num = l + (r - l) / 2;
            if(guess(num) == -1) r = num - 1;
            else if(guess(num) == 1) l = num + 1;
            else return num;
        }
        return -1;
    }

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    private int guess(int num) {
        return 0;
    }
}
