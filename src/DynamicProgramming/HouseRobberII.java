package DynamicProgramming;

// https://leetcode.com/problems/house-robber-ii/
// Leetcode problem 213. House Robber II

import java.util.Scanner;

public class HouseRobberII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum robbed amount is " + rob(arr));
    }

    //Main leetcode function....
    // This solution is slight change of house robber I solution

    static int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        // int dp[] = new int[n];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        int case1 = rob2(nums, 0, n - 2);
        int case2 = rob2(nums, 1, n - 1);
        return Math.max(case1, case2);
    }

    // Space optimised House robber problem....
    static int rob2(int[] nums, int start, int end){
        // int n = nums.length;
        // if(n == 0) return 0;
        // if(n == 1) return nums[0];
        // if(n == 2) return Math.max(nums[0], nums[1]);
        int prev1 = nums[start];
        int prev2 = Math.max(nums[start], nums[start + 1]);
        int curr = 0;
        for(int i = start + 2; i <= end; i++){
            curr = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }

}
