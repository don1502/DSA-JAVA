package DynamicProgramming;

// https://leetcode.com/problems/minimum-path-sum
// Leetcode problem 64. Minimum Path Sum

import java.util.*;

public class MinimumPathSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(minPathSum(arr));
    }

    // Main leetcode function....

    static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i <= n - 1; i++) // Traversing till col-1....
            dp[0][i] = dp[0][i - 1] + grid[0][i]; // Filling rows
        for(int i = 1; i <= m - 1; i++) // Traversing till row-1....
            dp[i][0] = dp[i - 1][0] + grid[i][0]; // Filling columns

        for(int i = 1; i <= m - 1; i++){
            for(int j = 1; j <= n - 1; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

}
