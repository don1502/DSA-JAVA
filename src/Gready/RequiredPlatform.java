package Gready;

// https://www.hackerrank.com/contests/sjitdream/challenges/minimum-platforms-4-1

/*
Given the arrival and departure times of all trains that reach a railway station,
the task is to find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays that represent the arrival and departure times of trains that stop.
 */

import java.util.*;

public class RequiredPlatform {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arrival = new int[n];
        int [] depature = new int[n];
        for (int i = 0; i < n; i++) {
            arrival[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            depature[i] = input.nextInt();
        }
        Arrays.sort(arrival);
        Arrays.sort(depature);
        int platform = 1;
        int final_platform = 1;
        int i = 1;
        int j = 0;
        while(i < n && j < n){
            if(arrival[i] <= depature[j]){
                platform++;
                final_platform = Math.max(platform, final_platform);
                i++;
            }else{
                platform--;
                j++;
            }
        }
        System.out.print(final_platform);
    }
}
