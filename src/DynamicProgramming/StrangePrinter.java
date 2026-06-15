package DynamicProgramming;

// https://leetcode.com/problems/strange-printer/
// Leetcode problem 664. Strange Printer

import java.util.Scanner;

public class StrangePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String series = input.next();
        System.out.println("Operations to print all string is " + strangePrinter(series));
    }

    // Main Leetcode function...

    static int strangePrinter(String series) {
        if (series == null || series.length() == 0) {
            return 0;
        }
        int n = series.length();
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + 1;
                for (int k = i; k < j; k++) {
                    if (series.charAt(k) == series.charAt(j)) {
                        int turns = dp[i][k] + (k + 1 <= j - 1 ? dp[k + 1][j - 1] : 0);
                        dp[i][j] = Math.min(dp[i][j], turns);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }

}
