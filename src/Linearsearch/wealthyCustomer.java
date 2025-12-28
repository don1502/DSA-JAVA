package Linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Scanner;

// Easy problem 1672. Richest Customer Wealth

public class wealthyCustomer {
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
        int result = maximumWealth(arr);
        System.out.println("Richest customer has wealth of " + result);
    }
// Main leetcode function.
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for( int row = 0; row < accounts.length; row++ ) {
            int sum = 0;
            for( int col = 0; col < accounts[row].length; col++ ) {
                sum += accounts[row][col];
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
