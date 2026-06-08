package DynamicProgramming;

// https://leetcode.com/problems/word-break/
// Leetcode problem 139. Word Break

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        String s = input.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(input.nextLine());
        }
        System.out.println("Is the word contain in dictionary " + wordBreak(s, list));
    }

    //Main leetcode function....

    static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean dp[] = new boolean[n + 1];
        dp[0] = true;
        for(int i = 1; i <= n ; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] == true && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

}
