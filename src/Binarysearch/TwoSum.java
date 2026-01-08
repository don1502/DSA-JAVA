package Binarysearch;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
// Leetcode problem 167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();
        System.out.print("The elements are in "+ Arrays.toString(twoSum(arr, target)));
    }

    // Main Leetcode problem....

    static int[] twoSum(int[] numbers, int target) {
        int [] result = search(numbers, target);
        return result;
    }
    static int[] search(int[] nums, int target){
        int [] arr = {1,1};
        int start = 0;
        int end = nums.length - 1;
        while( start < end){
            if((nums[start] + nums[end]) == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }else if ((nums[start] + nums[end]) > target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}
