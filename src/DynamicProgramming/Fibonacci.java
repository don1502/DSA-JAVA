package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

// This is the starting of memoization and Dynamic Programming....

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to calculate fibonacci: ");
        int n = input.nextInt();
        System.out.println("The fibonacci of the number " + n + " is " + fib(n));
    }

    // Main function...



    static HashMap<Integer, Long> memo = new HashMap<>();

    static long fib(int a){
        if (memo.containsKey(a)) return memo.get(a);

        if(a <= 2) return 1;

        long result = fib(a - 1) + fib(a - 2);
        memo.put(a, result);
        return result;
    }

}
