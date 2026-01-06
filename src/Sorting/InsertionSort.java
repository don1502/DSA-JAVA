package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        insertionSorting(arr);

        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    static void insertionSorting(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swapping(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
