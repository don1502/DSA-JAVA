package Arrays;

import java.util.*;

// John is working on a program to calculate the difference between the first and last elements of an array.
// Write a program that takes the size of the array and its elements as input,
// and prints the difference between the first element and the last element (first - last).

public class Difference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(arr[0] - arr[n-1]);
    }
}

// Input
// 3
// 5 7 8

// Output
// -3