package Numbers;

// https://leetcode.com/problems/a-number-after-a-double-reversal
// leetcode problem 2119. A Number After a Double Reversal

import java.util.Scanner;

public class doubleReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Is double reverse of the number is same number " + isSameAfterReversals(n));
    }

    // Main leetcode function....

    static boolean isSameAfterReversals(int num) {
        if(num%10==0 && num > 1) return false; // Exceptional case as  0 reverse is 0  and its reverse is 0 again.
        return true;
    }

}
