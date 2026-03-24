package Arrays;

import java.util.*;

// Arun is a teacher at a school, and he has recently conducted an exam for your students.
// The exam grades of the students are represented as an array of integers.
// He want to determine the number of inversions in the list of grades.

//Given an array of integers, find the inversion count in the array using insertion sort.

//Inversion Count: For an array, the inversion count indicates how far (or close) the array is from being sorted.
// If the array is already sorted, then the inversion count is 0. If an array is sorted in reverse order,
// then the inversion count is the maximum.

//Formally, two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

public class InversionCount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(sequence(arr));
    }

    // Main function...

    static int sequence(int[] arr){
        int inversion = 0;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                inversion++;
                j--;
            }
            arr[j+1] = key;
        }
        return inversion;
    }
}


// Input
// arr[] = {8, 4, 2, 1}

// Output
// 6

// Explanation
// The sequence has six inversions (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).