package DynamicProgramming;

// https://leetcode.com/problems/coin-change
// Leetcode problem 322. Coin Change

import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = input.nextInt();
        }
        int amount = input.nextInt();
        System.out.println("Minimum coins required to attain amount is " + coinChange(coins,amount));
    }

    // Main Leetcode function.....

    static int coinChange(int[] coins, int amount) {
        int [] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j < dp.length; j++){
                if(dp[j - coins[i]] == Integer.MAX_VALUE){
                    continue;
                }
                dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

}
