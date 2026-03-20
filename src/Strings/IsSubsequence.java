package Strings;

// https://leetcode.com/problems/is-subsequence/
// Leetcode problem 392. Is Subsequence

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String a = input.nextLine();
        System.out.println("Enter 2nd string: ");
        String b = input.nextLine();
        System.out.println("Is the given 1st string is sub-sequence of 2nd string " + isSubsequence(a, b));
    }

    // Main leetcode function...

    static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }

}
