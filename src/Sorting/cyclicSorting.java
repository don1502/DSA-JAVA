package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class cyclicSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        sort(arr);
        System.out.print("The sorted array " + Arrays.toString(arr));
    }

    static void sort(int [] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swapping(arr, i, correct);
            }else i++;
        }
    }
    static void swapping(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
