package DynamicProgramming;

// https://leetcode.com/problems/coin-change-ii/
// Leetcode problem 518. Coin Change II

import java.util.*;

public class CoinChangeII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = input.nextInt();
        }
        int amount = input.nextInt();
        System.out.println("Maximum possibility to attain the amount using coins are " + change(amount, coins));
    }

    // Main leetcode function

    static int change(int amount, int[] coins) {
        int [] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j <= amount; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount] == 0 ? 0 : dp[amount];
    }

}
