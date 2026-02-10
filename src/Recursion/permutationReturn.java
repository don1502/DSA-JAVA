package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class permutationReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = input.next();

        System.out.println("The permutations of the given string is " + permutations("", st));
    }

    // Main function for returning permutations in an array list

    static ArrayList<String> permutations(String processed, String unProcessed){

        if (unProcessed.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(processed);

            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());

            answer.addAll(permutations(first+ch+second, unProcessed.substring(1)));

        }
        return answer;
    }

}
