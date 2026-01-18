package BitManipulation;

// https://leetcode.com/problems/single-number-ii/
// leetcode problem 137. Single Number II

import java.util.Scanner;

public class singleNumInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The unique element in array is " + singleNumber(arr));
    }

    // Main leetcode function....

    static int singleNumber(int[] nums) {
        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }
}
