package DynamicProgramming;

// https://leetcode.com/problems/unique-paths-ii
// Leetcode problem 63. Unique Paths II

import java.util.*;

public class UniquePathII {
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
        System.out.println("Unique paths with obstacles are " + uniquePathsWithObstacles(arr));
    }

    // Main leetcode function..

    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp  = new int[m][n];
        for(int i = 0; i < m; i++) Arrays.fill(dp[i], -1);
        return path(obstacleGrid, dp, m - 1, n - 1);
    }
    static int path(int[][] obstacleGrid, int [][] dp, int m, int n){
        if(m < 0 || n < 0) return 0;
        if(obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = path(obstacleGrid, dp,  m - 1, n) + path(obstacleGrid, dp, m, n -1);
    }

}
