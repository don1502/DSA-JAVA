package Hashmap;

// https://leetcode.com/problems/group-anagrams/
// Leetcode problem 49. Group Anagrams

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        input.nextLine();// This handles the input buffers.
        String[] strs = new String[size];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = input.nextLine();
        }
        System.out.println("Group anagram strings of given strings are ");
        System.out.println(groupAnagrams(strs));
    }

    // Main leetcode function...

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : strs) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr);                    // create signature
            String key = new String(arr);        // e.g. "aet" for "eat"/"tea"/"ate"
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        return new ArrayList<>(map.values());
    }

}
