package Graph;

// https://leetcode.com/problems/find-the-town-judge/
// Leetcode problem 997. Find the Town Judge

public class TownJudge {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int person = 0; person < count.length; person++) {
            if (count[person] == n - 1) return person;
        }
        return -1;
    }

}
