package BitManipulation;

import java.util.Scanner;

// Magic number is " each digit of binary is multiplied with 5 powers " This is magic number

public class magicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int base = 5;
        int sum = 0;

        while(n>0){
            int last = n & 1;
            sum = sum + (last * base);
            base *= 5;
            n = n >> 1;
        }

        System.out.print("The nth magic number is " + sum);

    }
}
