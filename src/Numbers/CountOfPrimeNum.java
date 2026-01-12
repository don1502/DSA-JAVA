package Numbers;

// https://leetcode.com/problems/count-primes
// Leetcode problem 204. Count Primes

import java.util.Arrays;
import java.util.Scanner;

public class CountOfPrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int result = countPrimes(n);
        System.out.print("The number of prime numbers is "+result);
    }

    // main leetcode function...

    static int countPrimes(int n) {
        if (n == 0) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        int count = 0;
        isPrime[0] = false;
        if (n > 1) isPrime[1] = false;

        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                count++;
                int j = i * 2;
                while (j < n) {
                    isPrime[j] = false;
                    j = j + i;
                }
            }
        }

        return count;
    }

}

/* Intuition
The problem asks us to count all prime numbers less than n. A brute force approach of checking each number individually would be too slow. Instead, we can use the Sieve of Eratosthenes - an ancient algorithm that efficiently finds all primes by eliminating multiples of each prime number. The key insight is: if a number is prime, all its multiples must be composite.

Approach
Initialize: Create a boolean array isPrime of size n, assuming all numbers are prime initially. Mark 0 and 1 as non-prime (by definition).

Sieve Process: Iterate through each number from 2 to n-1:

If the current number i is still marked as prime, increment our count
Mark all multiples of i (starting from 2*i) as composite (non-prime)
Use j = j + i to efficiently jump to the next multiple
Count: As we iterate, we count each prime number we encounter before marking its multiples.

Edge Case: Handle n = 0 by returning 0 immediately.

Example walkthrough for n = 10:

Start: [-, -, T, T, T, T, T, T, T, T] (- = false, T = true)
i=2 (prime): count=1, mark 4,6,8 → [-, -, T, T, F, T, F, T, F, T]
i=3 (prime): count=2, mark 6,9 → [-, -, T, T, F, T, F, T, F, F]
i=4 (not prime): skip
i=5 (prime): count=3, mark 10 → would mark outside array
i=7 (prime): count=4
Result: 4 primes (2, 3, 5, 7)
*/
