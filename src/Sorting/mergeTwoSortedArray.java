package Sorting;

// https://leetcode.com/problems/merge-sorted-array/
// Leetcode problem 88. Merge Sorted Array

import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = input.nextInt();
        }

        System.out.println("Enter the number of elements in arrays " );
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The mergerd array is " );
        merge(arr1, num1, arr2, num2);

    }

    // Main leetcode function...

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }

}
