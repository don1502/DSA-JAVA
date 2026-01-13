package Strings;

// https://leetcode.com/problems/multiply-strings/
// Leetcode problem 43. Multiply Strings

import java.util.Scanner;

public class multipyingStringInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String num1 = input.next();
        String num2 = input.next();

        String result = multiply(num1, num2);
        System.out.print("The multiplication of string numbers are "+ result);
    }

    // Main leetcode function .....

    static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
