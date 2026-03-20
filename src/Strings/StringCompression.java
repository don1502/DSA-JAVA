package Strings;

// https://leetcode.com/problems/string-compression/
// Leetcode problem 443. String Compression

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character array:");
        String don = input.nextLine();
        System.out.println("The compressed version of String is " + compress(don.toCharArray()));
    }

    // Main leetcode function...

    static int compress(char[] chars) {
        int write = 0, read = 0;
        while (read < chars.length) {
            char ch = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == ch) {
                read++; count++;
            }
            chars[write++] = ch;
            if (count > 1){
                for (char c : String.valueOf(count).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }

}
