package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/longest-repeating-character-replacement/
// Leetcode problem 424. Longest Repeating Character Replacement

import java.util.*;

public class LongestRepeatCharReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = input.nextLine();
        int  k = input.nextInt();
        System.out.println("Longest repeating character replacement is " + characterReplacement(s, k));
    }

    // Main leetcode function....

    static int characterReplacement(String s, int k) {
        int n=s.length();
        int maxlen=0,maxf=0;
        int i=0,j=0;
        Map<Character,Integer>map=new HashMap<>();

        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxf=Math.max(maxf,map.get(ch));

            while((j-i+1)-maxf>k){
                char ch2=s.charAt(i);
                map.put(ch2,map.get(ch2)-1); //decrement the frequency
                i++;

            }
            // if((j-i+1)+maxf<=k){
            maxlen=Math.max(maxlen,j-i+1);
            // }

            j++;
        }
        return maxlen;

    }

}
