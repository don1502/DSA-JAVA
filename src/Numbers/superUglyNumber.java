package Numbers;

// https://leetcode.com/problems/super-ugly-number/
// Leetcode problem 313. Super Ugly Number

import java.util.Scanner;

public class superUglyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int low = input.nextInt();
        System.out.println("Enter the prime numbers: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(nthSuperUglyNumber(low, arr));
    }

    // Main Leetcode function...

    static int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] ugly = new int[n];        // store final ugly numbers (fit in int per problem)
        int[] index = new int[k];      // pointers for each prime
        long[] nextVal = new long[k];  // store next candidates as long to avoid overflow

        // initialize: each prime's first candidate is prime * ugly[ index=0 ] == prime * 1
        for (int j = 0; j < k; j++) {
            nextVal[j] = primes[j]; //  primes[j] * ugly[0] (ugly[0] will be 1)
        }

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            // pick smallest candidate among all primes (use long comparison)
            long nextUglyLong = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                if (nextVal[j] < nextUglyLong) nextUglyLong = nextVal[j];
            }

            // store it (we know it fits in 32-bit by problem statement)
            ugly[i] = (int) nextUglyLong;

            // advance all indices that matched nextUglyLong and recompute their candidate
            for (int j = 0; j < k; j++) {
                if (nextVal[j] == nextUglyLong) {
                    index[j]++; // move pointer forward
                    // Recompute next candidate as prime * ugly[index[j]] using long
                    nextVal[j] = (long) primes[j] * (long) ugly[index[j]];
                }
            }
        }

        return ugly[n - 1];
    }

}
