package Numbers;

// https://leetcode.com/problems/perfect-number/
// Leetcode problem 507. Perfect Number

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Is the given number is a perfect number -- " + checkPerfectNumber(n));
    }

    // Main leetcode function...
    static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if( num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num) return true;
        else return false;
    }
}
