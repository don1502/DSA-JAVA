package Recursion;

import java.util.Scanner;

public class permutationsOfAlpha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = input.next();

        permutation("", st);
    }

    // Main function

    static void permutation(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }

        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            permutation(first+ch+second, unProcessed.substring(1));
        }

    }

}
