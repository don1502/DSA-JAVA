package Binarysearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Easy Leetcode problem 744. Find Smallest Letter Greater Than Target

import java.util.Scanner;

public class SmallestLetterGreaterTarget {
    // This is typically as same as ceiling of number but the only change is we will
    // only look for greater than target and not equal to target
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.next().charAt(0);
        }
        System.out.println("Enter the element to be searched: ");
        char target = input.next().charAt(0);
        char result = nextGreatestLetter(arr, target);
        System.out.println("The next greatest letter after target for given array is " + result);
    }

    // Main leetcode function...

    static char nextGreatestLetter(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;

            // As we will return only smallest greater value than mid we dont want to check target == mid

            if (target < arr[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return arr[low % arr.length]; // This single line can return arr[0] if target >= arr[arr.length-1]
    }
}
