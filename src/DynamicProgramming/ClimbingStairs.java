package DynamicProgramming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = input.nextInt();
        System.out.println(climbingStrirs(n));
    }


    // Space optimised solution for climbing stairs....

    // public int climbStairs(int n) {

    //     if (n == 1) return 1;
    //     if (n == 2) return 2;

    //     int first = 1;
    //     int second = 2;
    //     int result = 0;

    //     for (int i = 3; i <= n; i++) {
    //         result = first + second;
    //         first = second;
    //         second = result;
    //     }

    //     return result;
    // }


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
