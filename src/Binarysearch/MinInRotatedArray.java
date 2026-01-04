package Binarysearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
// Leetcode problem 153. Find Minimum in Rotated Sorted Array

// Same but leetcode hard -- with duplicates
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// Leetcode problem 154. Find Minimum in Rotated Sorted Array II
// In this problem only the pivot function will be changes --> See that in searchRotArrWithDup.java....

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinInRotatedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int result = searchMin(arr);
        System.out.println("The minimum value is " + result );
    }

    // Main leetcode function....

    static int searchMin(int [] arr)
    {int pivot = pivotElement(arr);

    // if you did not find a pivot, it means the array doesnot rotated so do normal binary search
        if (pivot == -1){
        return arr[0];
    }
    // if pivot found
        return arr[pivot + 1];

}
static int pivotElement(int[] arr){
    int low = 0;
    int high = arr.length - 1;
    int mid = 0;
    while(low <= high){
        mid = low + (high - low) / 2;

        // there are 4 cases to find the pivot element

        if ( mid < high && arr[mid] > arr[mid+1]){ // we check that mid<high because at one point mid will
            // point high and if mid+1 happens it will give arrayoutofbound
            return mid;
        }
        if (mid > low && arr[mid] < arr[mid-1]){
            return mid-1;
        }
        if (arr[low] >= arr[mid]){
            high = mid - 1;
        }else {
            low = mid + 1;
        }
    }
    return -1;
}
}
