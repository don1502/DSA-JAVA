package BitManipulation;

// https://leetcode.com/problems/reverse-bits/
// Leetcode problem 190. Reverse Bits

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("The reversed bit value for given number is " + reverseBits(n));
    }

    // Main leetcode function....

    static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;   // unsigned right shift
        }
        return result;
    }
}
