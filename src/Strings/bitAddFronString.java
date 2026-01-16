package Strings;

// https://leetcode.com/problems/add-binary/
// Leetcode problem 67. Add Binary..

import java.util.Scanner;

// This will also come under bit manipulation...

public class bitAddFronString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String num1 = input.next();
        String num2 = input.next();

        String result = addBinary(num1, num2);
        System.out.print("The addition of bits are "+ result);
    }

    // Main leetcode function...

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';

            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }

}
