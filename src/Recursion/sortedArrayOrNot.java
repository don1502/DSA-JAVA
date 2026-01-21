package Recursion;

// Checking whether the given array is sorted or not using recursion...

import java.util.Scanner;

public class sortedArrayOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int index = 0;
        System.out.println("Whether the given array is sorted " + isSorted(arr,index));

    }

    // Recursive function..

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1) return true;
        return (arr[index] < arr[index+1]) && isSorted(arr,index+1);
    }

}
