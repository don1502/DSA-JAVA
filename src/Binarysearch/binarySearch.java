package Binarysearch;

// This is the basic binary search
// Basically binary search is used for searching in sorted arrays

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();
        BinarySearch(arr, target);
    }
    static void BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1; // length-1, because to avoid ArrayIndexOutOfBoundry error.
        int mid = 0;
        while(low <= high){ // <= is used because, then only it will find the element if the target is in 1st index.
            mid = high - low / 2;
            if (arr[mid] == target){
                System.out.println("Element found");
                return;
            }
            else if (target < arr[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}
