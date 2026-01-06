package Sorting;

// Bubble sort is technique which compare adjustent element and swap them
// It is also called as Sinking sort or exchange sort.

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        bubblesort(arr);

        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        // run step n-1 times
        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            // for each step max item will come at the last index...
            for(int j = 1; j <= arr.length - i - 1; j++){
                // Swap if the item is smaller than the previous item...
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means array is already sorted hence end function
            if (!swapped){
                break;
            }
        }
    }
}
