package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("The factorial of number is " + fact(n));
    }

    static int fact(int n){
        if (n==1) return 1;
        return n * fact(n-1);
    }
}
