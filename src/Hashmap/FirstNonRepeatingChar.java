package Hashmap;

// https://leetcode.com/problems/first-unique-character-in-a-string/
// Leetcode problem 387. First Unique Character in a String

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = input.nextLine();
        System.out.println("The first non repeating character in string is " + firstUniqChar(a));
    }

    // Main leetcode function

    static int firstUniqChar(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        // Step 2: Find first with count = 1
        for (int i = 0; i < s.length(); i++)
            if (freq.get(s.charAt(i)) == 1) return i;

        return -1;
    }

}
