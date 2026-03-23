package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// Leetcode problem 1423. Maximum Points You Can Obtain from Cards

import java.util.Scanner;

public class MaximumPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the 'K' size: ");
        int k = input.nextInt();
        System.out.println("The maximum points you can obtain from the card is " + func(arr, k));
    }

    // Main leetcode function....

    static int func(int[] arr, int k) {
        int lSum = 0;
        int rSum = 0;

        for (int i = 0; i < k; i++) {
            lSum += arr[i];
        }

        int maxSum = lSum;
        int right = arr.length - 1;

        for (int i = k - 1; i >= 0; i--) {
            lSum -= arr[i];
            rSum += arr[right];
            right--;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }
}
