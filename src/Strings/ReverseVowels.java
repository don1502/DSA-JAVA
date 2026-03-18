package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {

        // This is a two pointers technique.
        // Reversing the vowels in a string and not the string "hello" -> "holle"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = input.nextLine();
        input.nextLine();
        System.out.println("Reversed vowel of string is " + Arrays.toString(reverseVowel(s)));
    }

    static char[] reverseVowel(String s){
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length-1;
        while(left < right){
            if (!isVowel(a[left])){
                left++;
            } else if (!isVowel(a[right])) {
                right--;
            }else {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return a;
    }

    static boolean isVowel(char a){
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' );
    }

}
