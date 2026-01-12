package Numbers;

// https://leetcode.com/problems/ugly-number/
// Leetcode problem 263. Ugly Number

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        boolean result = isUgly(n);
        System.out.print("The give number is ugly number "+result);
    }

    // main leetcode functon...

    static boolean isUgly(int n) {
        if (n <= 0) return false;
        while(n > 1)
        {
            if (n % 2 == 0) n = n / 2;
            else if (n % 3 == 0) n = n / 3;
            else if (n % 5 == 0) n = n / 5;
            else break;
        }
        return (n == 1);
    }
}
