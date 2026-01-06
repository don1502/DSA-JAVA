package Binarysearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();
        System.out.println("The target element present in " + Arrays.toString(search(arr, target)));
    }

    static int[] search(int [][] arr, int target){
        int row = 0;
        int column = arr.length-1;

        while( row < arr.length && column >= 0){
            if(arr[row][column] == target){
                return new int[]{row, column};
            }
            if(arr[row][column] < target){
                row++;
            }else {
                column --;
            }
        }
        return new int[]{-1, -1};
    }
}
