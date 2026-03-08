package Sorting;

// https://leetcode.com/problems/squares-of-a-sorted-array/
// Leetcode problem 977. Squares of a Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The square of sorted array is " + sortedSquares(arr));

    }

    // Main leetcode problem

    static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        sort(nums, 0, nums.length-1);
        return nums;
    }
    static void sort(int [] arr, int low, int high){
        if (low >= high) return;

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while (s <= e){
            // It is also the reason why if its already sorted then it will not sort.
            // In merge sort if the array is already sorted then also it will sort but this line stops it.

            // This is the reason why we use quicksort for arrays and merge sort for linkedlist stuffs
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Now my pivot is at correct position so now sort two halves of the array

        sort(arr, low, e);
        sort(arr, s, high);

    }

}
