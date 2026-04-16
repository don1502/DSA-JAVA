package DynamicProgramming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = input.nextInt();
        System.out.println(climbingStrirs(n));
    }

    // Stairs can be climbed by two ways either by single steps or double steps.

    // This is a solution using dynamic programming bottom-up approach

    static int climbingStrirs(int n) {
        int [] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }

}
