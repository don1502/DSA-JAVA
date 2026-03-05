package Numbers;

// https://leetcode.com/problems/climbing-stairs/
// Leetcode problem 70. Climbing Stairs

import java.util.Scanner;


public class climbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int result = climbStairs(n);
        System.out.print("The number of ways n step climb is "+result);
    }

    // Main leetcode function...

    static int climbStairs(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;
        int second = 2;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

}
