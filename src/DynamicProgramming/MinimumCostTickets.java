package DynamicProgramming;

// https://leetcode.com/problems/minimum-cost-for-tickets
// Leetcode problem 983. Minimum Cost For Tickets

import java.util.*;

public class MinimumCostTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] days = new int[n];
        for (int i = 0; i < n; i++) {
            days[i] = input.nextInt();
        }
        int m = input.nextInt();
        int [] costs = new int[m];
        for (int i = 0; i < n; i++) {
            costs[i] = input.nextInt();
        }
        System.out.println("Minimum costs for booking ticket is " + mincostTickets(days, costs));
    }

    // Main leetcode function..

    static int mincostTickets(int[] days, int[] costs) {
        int dp [] = new int[days[days.length - 1] + 1];
        Arrays.fill(dp, 0);
        HashSet<Integer> set = new HashSet<>();
        for (int num : days) {
            set.add(num);
        }
        for(int i = 1; i < dp.length; i++){
            if(set.contains(i)){
                int opt1 = dp[Math.max(0, i - 1)] + costs[0];
                int opt2 = dp[Math.max(0, i - 7)] + costs[1];
                int opt3 = dp[Math.max(0, i - 30)] + costs[2];
                dp[i] = Math.min(Math.min(opt1, opt2), opt3);
            }
            else dp[i] = dp[i - 1];
        }
        return dp[dp.length - 1];
    }

}
