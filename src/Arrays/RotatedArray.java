package Arrays;

// https://leetcode.com/problems/rotate-array/
// Leetcode problem 189. Rotate Array

import java.util.*;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        rotate(arr, k);
    }

    // Main leetcode function....

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] rot = new int[n];
        for(int i = 0; i < n; i++){
            rot[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) nums[i] = rot[i];
    }

}
