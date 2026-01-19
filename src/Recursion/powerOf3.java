package Recursion;

// https://leetcode.com/problems/power-of-three/
// Leetcode problem 326. Power of Three...

import java.util.Scanner;

public class powerOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println("Is the given number is power of three " + isPowerOfThree(n));
    }

    // Main leetcode problelm....

    static boolean isPowerOfThree(int n) {
        if (n < 3 && n != 1 ) return false;
        if ( n == 1) return true;
        return n%3 == 0 && isPowerOfThree(n/3);
    }
}
