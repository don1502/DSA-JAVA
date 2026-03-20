package Strings;

// https://leetcode.com/problems/count-and-say/
// Leetcode problem 38. Count and Say

import java.util.*;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        System.out.println("Count and say Run-Length Encoding: " + countAndSay(n));
    }

    // Main leetcode function...

    static String countAndSay(int n) {
        String curr = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < curr.length()) {
                char ch = curr.charAt(j);
                int count = 0;
                while (j < curr.length() && curr.charAt(j) == ch) {
                    j++;
                    count++;
                }
                sb.append(count).append(ch);
            }
            curr = sb.toString();
        }
        return curr;
    }

}
