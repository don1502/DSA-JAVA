package BitManipulation;

import java.util.Scanner;

public class setBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.print("The number of bits in the given number is " + setbits(n));
    }

    static int setbits(int n) {
        int count = 0;

        while ( n > 0){
            count++;
            n = n - (n & -n);
        }

        return count;
    }
}
