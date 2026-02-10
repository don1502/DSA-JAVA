package Strings;

// https://leetcode.com/problems/subsets-ii/
// Leetcode problem 90. Subsets II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subSetDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The subset of the arary elements is " + subsetdup(arr));
    }

    // Main function

    static List<List<Integer>> subsetdup(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0; i<arr.length; i++){
            start = 0;
            // if current and previous element is same then start = end + 1
            if (i > 0 && arr[i] == arr[i-1] ){
                start = end + 1;
            }
            end = outerList.size()-1;
            int size = outerList.size();

            for (int j = start; j < size; j++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(arr[i]);
                outerList.add(internalList);
            }
        }

        return outerList;
    }
}
