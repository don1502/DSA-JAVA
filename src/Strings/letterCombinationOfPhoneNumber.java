package Strings;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
// Leetcode problem 17. Letter Combinations of a Phone Number

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class letterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String digits = input.next();

        System.out.print(solve("", digits));
    }

    // Main leetcode problem

    static List<String> solve(String ans, String ip) {

        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }

        ArrayList<String> list = new ArrayList<>();

        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }

        return list;

    }
}
