package Numbers;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
// Leetcode problem 1342. Number of Steps to Reduce a Number to Zero

import java.util.Scanner;

public class stepsToMakeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println("The number of steps required to make the number to zero is " + numberOfSteps(n));
    }

    // Main leetcode function...

    static int numberOfSteps(int n) {
        int count = 0;
        while(n>0){
            if(n%2 == 1) {
                n = n-1;
                count++;
            }else{
                n = n / 2;
                count++;
            }
        }
        return count;
    }

}
