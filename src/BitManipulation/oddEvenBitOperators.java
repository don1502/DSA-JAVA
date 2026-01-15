package BitManipulation;

// Finding odd or even with Bit Operator

import java.util.Scanner;

public class oddEvenBitOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("Is the given number Odd " + isOdd(n));
    }

    private static boolean isOdd(int a) {
        return (a & 1) == 1;
        // Using "&" operator to check "Least Significant Bit" That is last bit of binary term of given number n
    }
}
