package Binarysearch;

// https://leetcode.com/problems/find-in-mountain-array/?envType=problem-list-v2&envId=binary-search
// leetcode problem 1095. Find in Mountain Array

import java.util.Scanner;

public class PeakInMountaiinArray {
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

        int result = search(arr,target);
        System.out.println("Peak element in array is "+result);
    }

    // See the leetcode problem.

    static int search(int [] arr, int target){
        int peak = peakElement(arr);
        int firstTry = BinarySearch(arr, target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        return BinarySearch(arr, target, peak+1, arr.length - 1);
    }

    static int peakElement(int [] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]){
                // You are in decreasing part of array. It may be the answer
                //this is why high!=-1
                high = mid;
            }else{
                //you are in acesending part of array
                low = mid + 1;
            }
        }
        // in the end, low == high and pointing to the largest number
        // low and high are always trying to find max element in the above 2 checks
        // hence, when they are pointing to the same element, that is max one because that is what check says
        return low; // or you can return high also
    }

    static int BinarySearch(int[] arr, int target, int low, int high) {

        boolean isAce = arr[low] < arr[high];
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAce){
                if (target > arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else {
                if (target < arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
