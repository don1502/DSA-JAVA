package Gready;

// https://www.hackerrank.com/contests/sjitdream/challenges/work-allocate-sum/

/*
Given an array of jobs where every job has a deadline and associated profit if the job
is finished before the deadline. It is also given that every job takes a single unit of time,
so the minimum possible deadline for any job is 1.
Maximize the total profit if only one job can be scheduled at a time.
 */

import java.util.*;

public class WorkAssignSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = sc.nextInt(); // deadline
            jobs[i][1] = sc.nextInt(); // profit
        }

        System.out.println("Maximum profit is " + maxProfit(jobs, n));
    }

    static int maxProfit(int[][] jobs, int n) {

        //Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        // Max deadline
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int totalProfit = 0;
        for (int i = 0; i < n; i++) {
            int deadline = jobs[i][0];
            int profit   = jobs[i][1];

            for (int j = deadline; j >= 1; j--) {
                if (slots[j] == -1) {
                    slots[j] = profit;
                    totalProfit += profit;
                    break;
                }
            }
        }

        return totalProfit;
    }
}
