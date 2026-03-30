package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/binary-subarrays-with-sum/
// Leetcode problem 930. Binary Subarrays With Sum

import java.util.*;

public class BinarySubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array '0' & '1' : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the goal : ");
        int goal = input.nextInt();
        System.out.println("Number of subarrays with sum goal is " + numSubarraysWithSum(arr, goal));
    }

    // Main leetcode function...

    static int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }

    static int countAtMost(int[] nums, int goal) {
        if(goal < 0){
            return 0;
        }
        int left = 0, right = 0, sum = 0, count = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }

}
