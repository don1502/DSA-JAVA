package Binarysearch;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Leetcode problem 34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class LastPositionOfElement {

    // The function must return the starting and ending position of targeted element.

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Enter the element to be searched: ");
            int target = input.nextInt();
            System.out.println("The range of targeted element is " + Arrays.toString(searchRange(arr, target)));
    }

    // Main leetcode function....

    static int[] searchRange(int[] arr, int target) {
        int [] ans = {-1,-1};

        // Here we use two binary search two find both start and end position.
        // The time complexity is still O(logn) because average of two binary search....

        int start = searchPosition(arr, target, true);
        int end = searchPosition(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int searchPosition(int[] arr, int target, boolean isFirstElement) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = high - low / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirstElement) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
