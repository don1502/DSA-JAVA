package Numbers;

// Least Common Multiple

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println("The LCM of given numbers is " + leastCommonMultiple(n, m));
    }

    static int hcf ( int a, int b){
        if (a == 0) return b;
        return hcf(b%a, a);
    }

     static int leastCommonMultiple(int a, int b) {
        return a * b / hcf(a,b);
    }
}
