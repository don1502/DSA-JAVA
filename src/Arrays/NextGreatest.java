package Arrays;

import java.util.*;

// CLG PLACEMENT TRAINING QUESTION

// Mason is participating in a coding challenge where he must manipulate an integer array.
// His task is to replace every element in the array with the next greatest element to its right.
// The last element of the array remains unchanged, as there is no element to its right.
// Your job is to help Mason write a program that performs this transformation and outputs the modified array.

public class NextGreatest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        nextGreatest(arr);
    }

    // Main function...

    static void nextGreatest(int[] arr){

        int maxSoFar = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            int currentElement = arr[i];
            arr[i] = maxSoFar;
            if(currentElement > maxSoFar){
                maxSoFar = currentElement;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}


// Input:
// 6
// 12 3 91 15 12 14

// Output 1 :
// 91 91 15 14 14 14