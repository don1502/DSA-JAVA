package Hashmap;

// https://leetcode.com/problems/word-pattern/
// Leetcode problem 290. Word Pattern

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pattern:");
        String pattern = input.nextLine();
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        System.out.println("Is the string matches the pattern " + wordPattern(pattern, str));
    }

    // Main Leetcode function...

    static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> cToW = new HashMap<>();
        Map<String, Character> wToC = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (cToW.containsKey(c) && !cToW.get(c).equals(w)) return false;
            if (wToC.containsKey(w) && wToC.get(w) != c) return false;
            cToW.put(c, w); wToC.put(w, c);
        }
        return true;
    }

}
