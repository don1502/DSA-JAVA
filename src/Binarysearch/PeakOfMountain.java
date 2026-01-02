package Binarysearch;

import java.util.Scanner;

public class PeakOfMountain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int result = peakElement(arr);
        System.out.println("Peak element in array is "+result);
    }

    static int peakElement(int [] arr){
        int low = 0;
        int high = arr.length - 1; // length-1, because to avoid ArrayIndexOutOfBoundry error.
        int mid = 0;
        while(low < high){
            mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]){
                // You are in decreasing part of array. It may be the answer
                //this is why high!=-1
                high = mid;
            }else{
                //you are in acesending part of array
                low = mid + 1;
            }
        }
        // in the end, low == high and pointing to the largest number
        // low and high are always trying to find max element in the above 2 checks
        // hence, when they are pointing to the same element, that is max one because that is what check says
        return low; // or you can return high also
    }
}
