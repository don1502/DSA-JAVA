package Hashmap;

// https://leetcode.com/problems/minimum-window-substring/
// Leetcode problem 76. Minimum Window Substring

import java.util.*;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the stings: ");
        String s = input.nextLine();
        String t = input.nextLine();
        System.out.println("The minimum window substring is " + minWindow(s,t));
    }

    // Main leetcode function

    static String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0)+1);

        int have = 0, required = need.size();
        int l = 0, minLen = Integer.MAX_VALUE, minL = 0;
        Map<Character, Integer> window = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).equals(need.get(c))) have++;

            while (have == required) {
                if (r - l + 1 < minLen) { minLen = r - l + 1; minL = l; }
                char lc = s.charAt(l++);
                window.put(lc, window.get(lc) - 1);
                if (need.containsKey(lc) && window.get(lc) < need.get(lc)) have--;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minL, minL + minLen);
    }

}
