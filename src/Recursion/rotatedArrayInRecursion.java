package Recursion;

import java.util.Scanner;

public class rotatedArrayInRecursion {
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

        System.out.println("The target element is in " + search(arr, target, 0, arr.length-1));

    }

    // Main Recursive function...
    // This function is to find an element from the sorted rotated array using binary search in a recursive way...

    static int search(int[] arr, int target, int start, int end){
        if (start > end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;
        if (arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return search(arr, target, start, mid-1);
            }else return search(arr, target, mid+1, end);
        }
        if (target >= arr[mid] && target < end) return search(arr, target, mid+1, end);
        else return search(arr, target, start, mid-1);
    }
}
