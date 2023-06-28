package Arrays;

import java.util.Arrays;

/**
 * @author Ahmed Nabil
 */
public class _1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        return
                Arrays.stream(accounts)
                .map(banks -> Arrays.stream(banks).sum())
                .max(Integer::compare)
                .orElse(0);
    }
}
