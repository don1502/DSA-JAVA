package Gready;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Leetcode problem 122. Best Time to Buy and Sell Stock II

import java.util.Scanner;

public class BestStockSellii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum profit by selling stock = " + maxProfit(arr));
    }

    // Main leetcode function...

    static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++)
            profit += Math.max(prices[i] - prices[i - 1], 0);
        return profit;
    }

}
