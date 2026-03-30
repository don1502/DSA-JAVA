package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
// Leetcode problem 1358. Number of Substrings Containing All Three Characters

import java.util.*;

public class NumberOfSubstringContainThreeChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = input.nextLine();
        System.out.println("The number of substring with character 'a', 'b', 'c' is " + numberOfSubstrings(s));
    }

    // Main leetcode function...

    static int numberOfSubstrings(String s) {
        int len=0;
        int r=0;
        int[] arr=new int[3];
        Arrays.fill(arr,-1);
        while(r<s.length()){
            arr[s.charAt(r)-'a']=r;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                len = len + 1 + Math.min(arr[0], Math.min(arr[1], arr[2]));

            }
            r++;
        }
        return len;
    }

}
