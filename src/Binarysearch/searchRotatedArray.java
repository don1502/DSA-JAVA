package Binarysearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array
// Leetcode problem 33. Search in Rotated Sorted Array

import java.util.Scanner;

public class searchRotatedArray {
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

        int result = search(arr, target);
        System.out.println("The target element is in " + result);
    }

    static int search(int [] arr, int target){
        int pivot = pivotElement(arr);

        // if you did not find a pivot, it means the array doesnot rotated so do normal binary search
        if (pivot == -1){
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot found
        if ( arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return BinarySearch(arr, target, 0, pivot-1);
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int BinarySearch(int[] arr, int target, int low, int high) {
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target < arr[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
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

