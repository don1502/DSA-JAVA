package Binarysearch;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int n = input.nextInt();
        System.out.println("Is the number a perfect square " + isPerfectSquare(n));
    }
    static boolean isPerfectSquare(int num) {
        int square = mySqrt(num);
        if((square*square)== num){
            return true;
        }return false;
    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int low=0;
        int high = x;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (mid*mid ==x){
                return mid;
            }
            else if ((long) mid * mid > (long)x){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
}
