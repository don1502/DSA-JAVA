package Numbers;

// HCF/GCD ---> Highedst common factors for given numbers...

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println("The Highest Common Factor of given numbers is " + highestCommonFactor(n, m));
    }

    static int highestCommonFactor ( int a, int b){
        if (a == 0) return b;
        return highestCommonFactor(b%a, a);
    }
}
