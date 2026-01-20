package Recursion;

// https://leetcode.com/problems/power-of-four/
// Leetcode problem 342. Power of Four ( This comes under both maths and recursion)

import java.util.Scanner;

public class powerOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();

        System.out.println("Is the given number is power of four " + isPowerOfFour(n));

    }
    // Main leetcode function...

    static boolean isPowerOfFour(int n) {
        if (n < 4 && n != 1) return false;
        if (n == 1) return true;
        return n%4 == 0 && isPowerOfFour(n/4);
    }
}
