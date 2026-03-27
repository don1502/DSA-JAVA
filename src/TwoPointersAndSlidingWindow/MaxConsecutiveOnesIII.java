package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/max-consecutive-ones-iii/
// Leetcode problem 1004. Max Consecutive Ones III

import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        System.out.println("Enter the elements of array as '1' or '0' : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = input.nextInt();
        System.out.println("Max consecutive ones length is " + longestOnes(arr, k));
    }

    // Main leetcode function...

    static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxlen = 0, zeros = 0, len = 0;
        while(r < nums.length){
            if(nums[r] == 0) zeros++;
            while(zeros > k){
                if(nums[l] == 0) zeros--;
                l++;
            }
            if(zeros <= k){
                len = r - l + 1;
                maxlen = Math.max(maxlen, len);
            }
            r++;
        }
        return maxlen;
    }

}
