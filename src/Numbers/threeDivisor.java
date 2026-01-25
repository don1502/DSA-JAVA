package Numbers;

// https://leetcode.com/problems/three-divisors
// Leetcode problem 1952. Three Divisors

import java.util.Scanner;

public class threeDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Is the number has only 3 divisor " + isThree(n));

    }

    // Main lettcode function...

    static boolean isThree(int n) {
        int count = 0;
        int start = 1;
        while (start<=n){
            if(count > 3) return false;
            if(n%start==0) count++;
            start++;
        }
        if(count == 3) return true;
        return false;
    }

}
