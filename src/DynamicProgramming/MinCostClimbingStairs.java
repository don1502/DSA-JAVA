package DynamicProgramming;

// https://leetcode.com/problems/min-cost-climbing-stairs/
// Leetcode problem 746. Min Cost Climbing Stairs

import java.util.Scanner;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) arr[i] = input.nextInt();
        System.out.println("The minimum cost for climbing the stairs is " + minCostClimbingStairs(arr));
    }

    // Main leetcode function.....

    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < n; i++) dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        return Math.min(dp[n-1], dp[n-2]);
    }

}
