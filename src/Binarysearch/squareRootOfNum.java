package Binarysearch;

// https://leetcode.com/problems/sqrtx/
// Leetcode problem 69. Sqrt(x)

import java.util.Scanner;

public class squareRootOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int n = input.nextInt();
        int result = mySqrt(n);
        System.out.println("The square root of number is " + result);
    }

    // Main leetcode function...

    static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int low=0;
        int high = x;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (mid*mid ==x){
                return mid;
            }
            else if ((long) mid * mid > (long)x){ // Here we do "(long) mid*mid" and not "long a = mid*mid"
                                                // Because converting int into long and multiply doent cause integer overflow
                                                // if multiplying in int and asigning to long variable causes integer overflow error.
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
}
