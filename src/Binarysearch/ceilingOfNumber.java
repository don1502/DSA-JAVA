package Binarysearch;

// Ceiling of a number problem using binary search
// For sorted array always use binary search.....
// ceiling is "Smallest value element in array which is greater than or equal to target value"

// If the mid-value is the targeted number then function will return the value, because the target value is the
// smallest greater or equal to target. If the targeted value not present then the function will return "low" index value.

import java.util.Scanner;

public class ceilingOfNumber {
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
        int result = ceilingNumber(arr, target);
        System.out.println("The ceiling number for given array is " + result);
    }
    static int ceilingNumber(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1; // length-1, because to avoid ArrayIndexOutOfBoundry error.
        int mid = 0;
        while(low <= high){ // <= is used because, then only it will find the element if the target is in 1st index.
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
        return arr[low];
    }
}