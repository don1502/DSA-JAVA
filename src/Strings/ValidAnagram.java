package Strings;

// https://leetcode.com/problems/valid-anagram/
// Leetcode problem number 242. Valid Anagram

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        System.out.println("Is the given strings are valid anagram : " + isAnagram(s, t));
    }

    // Main leetcode function

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;
        for (int c : count) if (c != 0) return false;
        return true;
    }

}
