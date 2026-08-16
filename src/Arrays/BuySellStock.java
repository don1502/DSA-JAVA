package Arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Leetcode problem 121. Best Time to Buy and Sell Stock

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Max Profit is " + maxProfit(arr));
    }

    // Main leetcode function...

    static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

}
