package DynamicProgramming;

// https://leetcode.com/problems/n-th-tribonacci-number
// Leetcode problem 1137. N-th Tribonacci Number

import java.util.*;

public class NthTribonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Nth Tribonacci number is " + tribonacci(n));
        System.out.println("Nth Tribonacci number is " + tribonacciDP(n));
    }

    // Main leetcode function....

    static int tribonacci(int n) {
        if ( n == 0 ) return 0;
        if ( n == 2 || n == 1) return 1;
        int prev = 0;
        int ind = 1;
        int next = 1;
        int result = 0;
        for(int i = 3; i <= n; i++){
            result = prev + ind + next;
            prev = ind;
            ind = next;
            next = result;
        }
        return result;
    }

    static int tribonacciDP (int n){
        if ( n == 0 ) return 0;
        if ( n == 2 || n == 1) return 1;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

}
