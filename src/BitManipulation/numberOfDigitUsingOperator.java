package BitManipulation;

import java.util.Scanner;

public class numberOfDigitUsingOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int base = 10; // This base determine which number system should we check no.of digits.
        // If 10 then we check on decimal
        // If 2 then we check on binary

        int ans = (int)(Math.log(n) / Math.log(base)) + 1; // Formula for finding number of digit in binary bit...

        System.out.print("The number of digit is " + ans);
    }
}
