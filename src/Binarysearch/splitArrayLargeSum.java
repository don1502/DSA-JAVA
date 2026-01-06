package Binarysearch;

// https://leetcode.com/problems/split-array-largest-sum
// leetcode problem 410. Split Array Largest Sum "Hard Problem" (Asked in Google)

import java.util.Scanner;

public class splitArrayLargeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the targeted element : ");
        int target = input.nextInt();
        System.out.println("Maximum value of sub array is "+ splitArray(arr,target));
    }

    // Main leetcode function...

    static int splitArray(int[] arr, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.length; i++){
            low = Math.max(low, arr[i]);
            // in the end of loop this will contain max item from the array
            high += arr[i];
        }

        //Binary Search
        while(low < high){
            // Try for middle as potential answer..
            int mid = low + (high - low)/2;

            // Calculate how many pieces can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : arr) {
                if (sum + num > mid){
                    // you cannot add this in sub array; make new one
                    // say you add this num in subarray , then sum==num
                    sum = num;
                    pieces ++;
                }else {
                    sum += num;
                }
            }
            if (pieces > k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low; // In the end both low and high point same element so return any one...
    }
}
