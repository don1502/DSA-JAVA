package Strings;

import java.util.Scanner;

public class removeTargetStringFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String str = input.next();

        System.out.println("The elements after skipping apple is " + skipTarget(str) );
    }

    // Main leetcode function..

    static String  skipTarget(String unprocessedString){
        if(unprocessedString.isEmpty()){
            return "";
        }

        if (unprocessedString.startsWith("apple")){
            return skipTarget(unprocessedString.substring(5));
        } else {
            return unprocessedString.charAt(0) + skipTarget(unprocessedString.substring(1));
        }
    }

}
