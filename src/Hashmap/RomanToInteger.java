package Hashmap;

// https://leetcode.com/problems/roman-to-integer/
// Leetcode problelm 13. Roman to Integer

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Roman Number: ");
        String s = input.nextLine();
        System.out.println("Roman " + s + " to integer is " + romanToInt(s));
    }

    // Main leetcode function...

    static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0, prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            // result += (curr < prev) ? -curr : curr;
            // We can use as well as basic if else.
            if(curr < prev) result = result - curr;
            else result += curr;
            prev = curr;
        }
        return result;
    }

}
