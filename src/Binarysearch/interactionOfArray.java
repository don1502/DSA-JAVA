package Binarysearch;

// https://leetcode.com/problems/intersection-of-two-arrays/
// Leetcode problem 349. Intersection of Two Arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class interactionOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = input.nextInt();
        }

        System.out.print("The intersection of two lists are " + intersection(arr1, arr2));
    }

    // Main leetcode function....

    static void addList(ArrayList<Integer> list, int x) {
        if(list.isEmpty() || list.get(list.size() - 1) != x) {
            list.add(x);
        }
    }

    static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                addList(list, arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        for(int k = 0; k < result.length; k++) {
            result[k] = list.get(k);
        }

        return result;
    }

}
