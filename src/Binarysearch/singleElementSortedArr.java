package Binarysearch;

// https://leetcode.com/problems/single-element-in-a-sorted-array
// Leetcode problem 540. Single Element in a Sorted Array

import java.util.Scanner;

public class singleElementSortedArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The non duplicate element in the given array is " + singleNonDuplicate(arr));
    }

    // Main leetcode function....

    static int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if((mid%2)!=0)
                mid=mid-1;
            if(nums[mid]==nums[mid+1])
            {
                low=mid+2;
            }
            else
                high=mid;
        }
        return nums[low];
    }

}
