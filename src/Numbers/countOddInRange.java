package Numbers;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Leetcode problem 1523. Count Odd Numbers in an Interval Range

import java.util.Scanner;

public class countOddInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int low = input.nextInt();
        int high = input.nextInt();

        System.out.println("The number of odds in the given range is " + countOdds(low, high));
    }

    // Main leetcode function...

    static int countOdds(int low, int high) {

        // Brute force...
        int count = 0;
        while(low <= high ){
            if(low % 2 != 0){
                count++;
                low += 2;
            }else{
                low++;
            }
        }
        return count;
    }

    // return (high+1)/2 - low/2; ----> This a simple way to solve this problem.

}
