package Recursion;

// https://leetcode.com/problems/add-digits/
// Leetcode problem 258. Add Digits...

import java.util.Scanner;

public class addingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println("The sum of digits of number is " + addDigits(n));
    }

    // Main leetcode function...

    static int addDigits(int num) {
        int sum = 0;
        int i = 0;
        int digit;
        if ( num < 10) return num;
        while( i < num ){
            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        return addDigits(sum);
    }

}
