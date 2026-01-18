package Numbers;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.print(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n ){
        if (n <= 1) return false;
        int c = 2;
        while(c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }

}
