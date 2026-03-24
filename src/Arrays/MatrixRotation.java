package Arrays;

// You must write a program that rotates the 2D array by 90 degrees in-place.

import java.util.*;

public class MatrixRotation {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        rotate(arr);
    }

    // Main function...

    static void rotate(int [][] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
        System.out.println("Rotated 2D Array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
