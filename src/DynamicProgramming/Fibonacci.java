package DynamicProgramming;

import java.util.*;

// This is the starting of memoization and Dynamic Programming....

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to calculate fibonacci: ");
        int n = input.nextInt();
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("The fibonacci of the number " + n + " is " + fib(n));
        System.out.println("The fibonacci of the number " + n + " is " + fibdp(n, dp));
        System.out.println("The fibonacci of the number " + n + " is " + fibdp2(n, dp));
    }

    // Main function...



    static HashMap<Integer, Long> memo = new HashMap<>();

    static long fib(int a){
        if (memo.containsKey(a)) return memo.get(a);

        if(a <= 2) return 1;

        long result = fib(a - 1) + fib(a - 2);
        memo.put(a, result);
        return result;
    }

    // if(a <= 2) return 1;
    // if(a <= 1) return a;
    // Both are same only

    // Using level 1 DP
    static long fibdp(int a, long[] dp){
        if (dp[a] != -1) return dp[a];

        if(a <= 1) return a;

        return dp[a] = fibdp(a - 1, dp) + fibdp(a - 2, dp);
    }

    // Using tabulation or level 2 dp
    static long fibdp2(int a, long[] dp){
        // Updating both base cases into dp
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < a; i++) dp[i] = dp[i-1] + dp[i-2];
        // Why i = 2, because dp[0] and dp[1] already updated;
        return dp[a];
    }

}
