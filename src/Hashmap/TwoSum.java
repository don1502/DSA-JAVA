package Hashmap;

// https://leetcode.com/problems/two-sum/
// Leetcode problem 1. Two Sum

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the taget value: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    // Main leetcode function

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement))
                return new int[] { seen.get(complement), i };
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

}
