package Strings;

import java.util.Scanner;

public class subsequenceOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String str = input.next();

        subsequ("",str);
    }

    // Main function

    static void subsequ(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.println("The subsequence of given string is " + processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        subsequ(processed+ch, unProcessed.substring(1)); // This will add the character to substring
        subsequ(processed, unProcessed.substring(1));// This will skip the character from the substring
    }

}
