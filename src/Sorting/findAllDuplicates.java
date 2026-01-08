package Sorting;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Leetcode problem 442. Find All Duplicates in an Array...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class findAllDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        List<Integer> result =  findDuplicates(arr);
        System.out.print("The duplicates are " + result);
    }

    // Main Leetcode function....

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swapping(arr, i, correct);
            }else i++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
