package Gready;

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
// Leetcode problem 452. Minimum Number of Arrows to Burst Balloons

import java.util.*;

// This is similar to Assign performance problem with small changes.....

public class BalloonBurst {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr =new int [n][2];
        for(int i= 0; i < arr.length; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Minimum arrow required to burst balloons are " + findMinArrowShots(arr));
    }

    // Main leetcode function......

    static int findMinArrowShots(int[][] arr) {
        int total = 1;
        int i = 1;
        int e = 0;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1],b[1]));
        while(i < arr.length){
            if(arr[i][0] > arr[e][1]){
                e = i;
                // i++;
                total++;
            }
            i++;
        }
        return total;
    }

}
