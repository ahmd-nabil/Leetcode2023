package LeetCode75_studyplan;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ahmed Nabil
 */
public class KidsWithTheGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies).mapToObj(i -> i+extra >= max).toList();
    }
}
