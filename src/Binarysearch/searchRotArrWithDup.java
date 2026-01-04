package Binarysearch;

import java.util.Scanner;

public class searchRotArrWithDup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();

        int result = searchWithDuplicate(arr, target);
        System.out.println("The target element is in " + result);
    }

    // Here the main change will be in finding pivot element...
    // As it contains duplicate..

    static int searchWithDuplicate(int [] arr, int target){
        int pivot = pivotElement(arr);

        // if you did not find a pivot, it means the array doesnot rotated so do normal binary search
        if (pivot == -1){
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot found
        if ( arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return BinarySearch(arr, target, 0, pivot-1);
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int BinarySearch(int[] arr, int target, int low, int high) {
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
        return -1;
    }

    static int pivotElement(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;

            // there are 4 cases to find the pivot element

            if ( mid < high && arr[mid] > arr[mid+1]){ // we check that mid<high because at one point mid will
                // point high and if mid+1 happens it will give arrayoutofbound
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // if element at mid, low, high are equal then just skip the duplicates
            if (arr[mid] == arr[low] && arr[mid] == arr[high]){
                // What if these elements at low and high are pivot?
                // so we should check it first
                if (arr[low] > arr[low+1]){ // For checking whether start is pivot element.
                    return low;
                }
                low++;
                if (arr[high-1] > arr[high]){ // [3,3,3,3,1,3] If this is the given array and if func takes
                                              // last 3 as pivot then for returning minimum value will fail....
                    return high - 1;
                }
                high--;
            }
            // left side is sorted,so pivot should be in right
            else if (arr[low] < arr[mid] || (arr[low] == arr[mid] && arr[mid] > arr[high])) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
