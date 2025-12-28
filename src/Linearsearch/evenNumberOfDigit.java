package Linearsearch;// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

// Easy problem 1295. Find Numbers with Even Number of Digits
public class evenNumberOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int result = findNumbers(arr);
        System.out.println(result);
    }
    // Main Leetcde function.
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if(arr[i]<0) arr[i] *= -1;
            while(arr[i]>0){
                arr[i] = arr[i]/10;
                temp++;
            }
            if(temp%2==0){
                count++;
            }
        }
        return count;
    }
}
