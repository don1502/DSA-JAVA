package Gready;

// https://leetcode.com/problems/remove-k-digits/
// Leetcode problem 402. Remove K Digits

import java.util.*;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String str = input.next();
        System.out.println("Digits after removing k digits is " + removeKdigits(str, k));
    }

    // Main Leetcode function....

    static String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder();
        for(char c : num.toCharArray()){
            while (k > 0 && str.length() > 0 && str.charAt(str.length() - 1) > c){
                str.deleteCharAt(str.length() - 1);
                k--;
            }
            str.append(c);
        }
        for(; k > 0; k--){
            str.deleteCharAt(str.length() - 1);
        }
        String ans = "";
        int i = 0;
        for (; i < str.length() && str.charAt(i) == '0'; ++i) {
        }
        ans = str.substring(i);
        return "".equals(ans) ? "0" : ans;
    }

}
