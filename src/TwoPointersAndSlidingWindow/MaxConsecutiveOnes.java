package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/max-consecutive-ones/
// Leetcode problem 485. Max Consecutive Ones

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        System.out.println("Enter the elements of array as '1' or '0' : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Max consecutive ones length is " + findMaxConsecutiveOnes(arr));
    }

    // Main leetcode function

    static int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, r = 0, maxlen = 0, len = 0;
        while(r < nums.length){
            if(nums[r] == 1){
                len = r - l + 1;
                maxlen = Math.max(maxlen, len);
                r++;
            }else{
                l = r + 1;
                r++;
            }
        }
        return maxlen;
    }

}
