package Strings;

// https://leetcode.com/problems/longest-common-prefix/
// Leetcode problem 14. Longest Common Prefix

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array of String: ");
        int size = input.nextInt();
        input.nextLine();
        System.out.println("Enter the strings: ");
        String[] arr = new String[size];
        for (int i = 0; i < size; i++){
            arr[i] = input.nextLine();
        }
        System.out.println("The longest common prefix is " + longestCommonPrefix(arr));
    }

    // Main leetcode function...

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

}
