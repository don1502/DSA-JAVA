package Sorting;

import java.util.Scanner;

public class missingNumArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The missing value in array is "+ missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n*(n+1)/2;
        return (total - sumOfArray(nums));
    }

    static int sumOfArray(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
