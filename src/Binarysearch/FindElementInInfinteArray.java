package Binarysearch;

import java.util.Scanner;

// It is a problem which is asked in Amazon...

public class FindElementInInfinteArray {
    public static void main(String[] args){

        // This is input is given for simple understanding but the input for the problem is infinity.
        // So we don't know the length of the array....

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();

        System.out.println(ans(arr, target));

    }

    // This finding range serves to be the main function as it is the difficult part.
    // Here we double the size of range and find the element by binary search so the time complexity is O(logn).....

    static int ans(int [] arr, int target){
        // first find the range
        // first start with 2 boxes and then double it
        int low = 0;
        int high = 1;

        // condition to find the range for target element
        while( target > arr[high]){
            int newLow = high + 1;
            // double the box range...
            // newend = previsous end + sizeofbox*2
            high = high + (high - low + 1)*2; // high - low + 1 = size of box  + 1 is add to find size as index starts from 0...
            low = newLow; // here we update this because in above step we update with low.
        }
        return FindElement(arr, target, low, high);
    }

    static int FindElement(int [] arr, int target, int low, int high){
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target < arr[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return mid;
    }
}
