package Binarysearch;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix
// Leetcode problem 378. Kth Smallest Element in a Sorted Matrix...

import java.util.Scanner;

public class kthSmallestElement {
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

        System.out.println("The kth smallest element is " + kthSmallest(arr, target));
    }

    // Main leetcode function...


    static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0];
        int r = matrix[n - 1][n - 1];

        while(l < r){
            int mid = l + (r - l) / 2;
            int count = countLess(matrix, mid);
            if(count >= k){
                r = mid;
            }
            else l = mid + 1;
        }

        return l;
    }

    static int countLess(int[][] matrix, int x){
        int cnt = 0;
        int r = 0, c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] <= x){
                cnt += c + 1;
                r++;
            }
            else c--;
        }

        return cnt;
    }

}
