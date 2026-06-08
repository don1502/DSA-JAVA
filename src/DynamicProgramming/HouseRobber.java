package DynamicProgramming;

// https://leetcode.com/problems/house-robber
// Leetcode problem 198. House Robber

import java.util.*;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum robbed amount is " + rob(arr));
    }

    // Main leetcode function....

    static int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i <= n - 1; i++){
            int case1 = dp[i - 2] + nums[i];
            int case2 = dp[i - 1];
            dp[i] = Math.max(case1, case2);
        }
        return dp[n - 1];
    }


    //Space optimised problem....
    static int rob2(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        int curr = 0;
        for(int i = 2; i < n; i++){
            curr = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }

}
