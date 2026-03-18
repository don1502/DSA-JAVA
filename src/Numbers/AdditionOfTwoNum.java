package Numbers;

// https://leetcode.com/problems/sum-of-two-integers/
// Leetcode problem 371. Sum of Two Integers

import java.util.*;

public class AdditionOfTwoNum {
    public static void main(String[] args) {

        // This problem is addition of two number without addition symbol "+"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The addition of two numbers is " + getSum(a, b));
    }

    // Main leetcode function...

    static int getSum(int a, int b) {
        while(b!=0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
