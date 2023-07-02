package DynamicProgramming;
import java.util.Arrays;
/**
 * @author Ahmed Nabil
 */
public class _322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] ans = new int[amount+1];
        Arrays.fill(ans, amount + 1);
        ans[0] = 0;
        for(int m = 1; m <= amount; m++) {
            for(int coin : coins) {
                if(coin <= m) {
                    ans[m] = Math.min(ans[m], ans[m - coin] + 1);
                }
            }
        }
        return ans[amount] == amount + 1? -1 : ans[amount];
    }
}
