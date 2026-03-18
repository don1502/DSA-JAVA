package Hashmap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Leetcode problem 3. Longest Substring Without Repeating Characters

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {
    // Longest substring without repeating
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("The longest substring of string without repeating character is : " + lengthOfLongestSubstring(s));
    }

    // Main leetcode function
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c) && last.get(c) >= start)
                start = last.get(c) + 1;
            last.put(c, i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

}
