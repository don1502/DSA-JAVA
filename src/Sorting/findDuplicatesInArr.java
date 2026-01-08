package Sorting;

// https://leetcode.com/problems/find-the-duplicate-number/
// Leetcode problem 287. Find the Duplicate Number

import java.util.Scanner;

public class findDuplicatesInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("The duplicate element is " + findDuplicate(arr));
    }

    // Main leetcode function....
    // In leetcode it is in binary search.

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i< arr.length){

            if (arr[i] != i + 1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swapping(arr, i, correct);
                }else return arr[i];
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
