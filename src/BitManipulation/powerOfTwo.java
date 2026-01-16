package BitManipulation;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        boolean answer = (n & (n - 1)) == 0; // "(n - 1) == Compliment of n" If n and its compliment is 0 then it is power of 2

        System.out.print("Is given number is power of two " + answer);

    }
}
