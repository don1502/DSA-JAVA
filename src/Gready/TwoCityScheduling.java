package Gready;

// https://leetcode.com/problems/two-city-scheduling/
// Leetcode problem 1029. Two City Scheduling

import java.util.*;

public class TwoCityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // deadline
            arr[i][1] = sc.nextInt(); // profit
        }
        System.out.println("Total cost for travel is " + twoCitySchedCost(arr));
    }

    // Main leetcode problem.....

    static int twoCitySchedCost(int[][] costs) {
        // Sorting array by difference....
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
        int n = costs.length / 2;
        int total = 0;
        for(int i = 0; i < n; i++){
            int j = n + i;
            total = total + costs[i][0] + costs[j][1];
        }
        return total;
    }

}
