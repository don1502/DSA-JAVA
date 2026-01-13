package Numbers;

// https://leetcode.com/problems/happy-number/
// Leetcode problem 202. Happy Number

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.print("Is the given number is happy number : " + isHappy(number));
    }

    // Main Leetcode function...

    static boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappy(sum);
        }
    }

}
