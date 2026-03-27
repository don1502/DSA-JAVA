package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Leetcode problem 3. Longest Substring Without Repeating Characters

import java.util.*;

public class LongestSubStringWithoutDup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = input.nextLine();
        System.out.println("The longest substring length is " + lengthOfLongestSubstring(s));
    }

    // main leetcode function...
    static int lengthOfLongestSubstring(String s) {
        int [] hash = new int[255];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxLen = 0, len = 0;
        while(r < s.length()){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l) l = hash[s.charAt(r)] + 1;
            }
            len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

}
