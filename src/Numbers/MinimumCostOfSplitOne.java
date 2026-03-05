package Numbers;

// https://leetcode.com/problems/minimum-cost-to-split-into-ones/
// Leetcode probelm 3857. Minimum Cost to Split into Ones

import java.util.Scanner;

public class MinimumCostOfSplitOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("The minimum cost of spliting the number into one is " + minCost(a));
    }

    // Main leetcode function

    static int minCost(int n) {
        return n*(n-1)/2;
    }

}
