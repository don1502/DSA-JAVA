package Strings;

// https://leetcode.com/problems/subsets/
// Leetcode problam 78. Subsets

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subsetIteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The subset of the arary elements is " + subset(arr));
    }

    // Main function

    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int nums : arr){
            int size = outerList.size();

            for (int i = 0; i < size; i++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(nums);
                outerList.add(internalList);
            }
        }

        return outerList;
    }

}
