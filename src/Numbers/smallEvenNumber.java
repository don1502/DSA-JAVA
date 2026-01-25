package Numbers;

// https://leetcode.com/problems/smallest-even-multiple/
// Leetcode problem 2413. Smallest Even Multiple

import java.util.Scanner;

public class smallEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();



    }

    // Main leetcode function...

    static int smallestEvenMultiple(int n) {
        if(n % 2 == 0) return n;
        return n*2;
    }

}
