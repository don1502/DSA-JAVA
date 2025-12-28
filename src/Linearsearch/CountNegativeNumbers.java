package Linearsearch;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

import java.util.Scanner;

// Easy Leetcode problem 1351. Count Negative Numbers in a Sorted Matrix

public class CountNegativeNumbers {
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
        int result = countNegatives(arr);
        System.out.println("Total negative numbers in grid is " + result);
    }

    static int countNegatives(int[][] grid) {
        int negative = 0;
        for(int i =0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] < 0){
                    negative++;
                }
            }
        }
        return negative;
    }
}
