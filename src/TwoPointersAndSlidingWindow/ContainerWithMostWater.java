package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/container-with-most-water/
// Leetcode problem 11. Container With Most Water

import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum water container is " + maxArea(arr));
    }

    // Main Leetcode function....

    static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int width = r - l;
            int area = width * Math.min(height[l], height[r]);
            max = Math.max(max, area);
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }

}
