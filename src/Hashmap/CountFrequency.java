package Hashmap;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String s = "abcabcaabb";
        System.out.println(count(s));
    }

    // Main function
    static HashMap count(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return (HashMap) freq;
    }

}
