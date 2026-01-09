package Sorting;

// https://leetcode.com/problems/set-mismatch/
// Leetcode problem 645. Set Mismatch

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class setMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The mis matching element in array is " + Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapping(arr, i, correct);
            } else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return  new int [] {arr[j], j+1};
            }
        }
        return new int [] {-1,-1};
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
