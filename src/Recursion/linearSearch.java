package Recursion;

// Linear Search using recursion....

import java.util.Scanner;

public class linearSearch {
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

        int index = 0;

        System.out.println("The target element is in " + search(arr, target, index) + " position of array.");
    }

    // Main recursive function

    static int search(int[] arr, int target, int index){
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return search(arr,target,index+1);
    }

}
