package Sorting;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Leetcode problem 448. Find All Numbers Disappeared in an Array (Asked in Google)...

import java.util.*;

public class allNumDisappeared {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.print("The missing values are " + result);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapping(arr, i, correct);
            } else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                ans.add(j+1);
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
