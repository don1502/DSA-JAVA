package Strings;

import java.util.Scanner;

public class removeTargetLetterFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String str = input.next();

        skip("",str);

    }

    // Mian leetcode function
    // This fuction removes all the "a"from the string


    static void skip(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println("The string after removing a from strings is  " + processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            skip(processed, unProcessed.substring(1));
        } else {
            skip(processed + ch, unProcessed.substring(1));
        }

    }

}
