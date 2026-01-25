package Binarysearch;

// https://leetcode.com/problems/nth-digit/
// Leetcode problem 400. Nth Digit

import java.util.Scanner;

public class nthDigitInNumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int n = input.nextInt();
        System.out.println("The Nth digit of number is " + findNthDigit(n));
    }

    // Main leetcode function

    static int findNthDigit(int n) {
        long len=1,c=9,s=1;
        while(n>len*c){
            n-=len*c;
            len++;
            c*=10;
            s*=10;

        }
        s+=(n-1)/len;
        return String.valueOf(s).charAt((n-1)%(int)len)- '0';
    }

}
