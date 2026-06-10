package DynamicProgramming;

// https://leetcode.com/problems/unique-paths
// Leetcode problem 62. Unique Paths

import java.util.*;

public class UniquePath {
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
        System.out.println(uniquePaths(m,n));
        System.out.println(uniquePathsII(m,n));

    }

    // Main leetcode function.....

    // Memoization technique using 2D DP...

    static int uniquePaths(int m, int n) {
        int [][] dp  = new int[m][n];
        return path(dp, m - 1, n - 1);
    }
    static int path(int [][] dp, int m, int n){
        if(m == 0 && n == 0) return 1;
        if(m == -1 || n == -1) return 0;
        if(dp[m][n]  != 0) return dp[m][n];
        return dp[m][n] = path(dp,  m - 1, n) + path(dp, m, n -1);
    }

    // Tabulation using 2D DP...
    // This is top-down approach....
    static int uniquePathsII(int m, int n) {
        int [][] dp  = new int[m][n];
        // return path(dp, m - 1, n - 1);
        for(int i = 0; i < m; i++) dp[i][0] = 1;
        for(int i = 0; i < n; i++) dp[0][i] = 1;
        for(int i = 1;  i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
