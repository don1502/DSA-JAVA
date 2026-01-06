package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        SelectionSort(arr);

        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    static void SelectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the maximum in the array and swap with the correct index
            int last = arr.length-i-1;
            int max = getMax(arr, 0, last);
            swapping(arr, max, last);
        }
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int [] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
