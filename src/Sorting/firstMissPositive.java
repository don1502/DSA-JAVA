package Sorting;

// https://leetcode.com/problems/first-missing-positive/
// 41. First Missing Positive

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class firstMissPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The missing positive element in array is " + firstMissingPositiveNumber(arr));
    }

    // Main leetcode function..

    static int firstMissingPositiveNumber(int [] arr ){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swapping(arr, i, correct);
            } else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length + 1;
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
