package Recursion;

// https://leetcode.com/problems/number-of-digit-one/
// Leetcode problem 233. Number of Digit One

import java.util.Scanner;

public class numberOfOnesInN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println("The number of ones in the given number is " + countDigitOne(n));

    }

    // Main leetcode function...

    static int countDigitOne(int n) {

        // This function works only for small n and not for n greater like 3000000

        int i = n;
        int count = 0;
        while(i>0){
            int digit = i % 10;
            i = i / 10;
            if( digit == 1){count++;}
        }
        if(n != 0){
            return countDigitOne(n-1) + count;
        }
        return count;
    }

    // This functioin is a mathematical function which works for any number without recursion or DP(Dynamic programing)

//    public int countDigitOne(int n) {
//        int ones = 0;
//        for (long m = 1; m <= n; m *= 10)
//            ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
//        return ones;
//    }

}
