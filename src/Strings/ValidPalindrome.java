package Strings;

// https://leetcode.com/problems/valid-palindrome/
// Leetcode problem 125. Valid Palindrome

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = input.nextLine();
        System.out.println("Is the given string is palindrome : " + isPalindrome(s));
    }

    // Main leetcode function...

    static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while( left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

}
