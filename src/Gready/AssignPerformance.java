package Gready;

// https://www.hackerrank.com/contests/sjitdream/challenges/the-festival-stage-scheduler/problem

import java.util.*;

/*
* The kingdom of Arithmia is hosting its grand annual festival.
* Throughout the day, performers from different villages arrive to showcase their talents on the royal stage.
* Each performance requires exclusive use of the stage from its start time to its end time.
* Since there is only one stage, two performances cannot overlap.
* As the royal event coordinator, your task is to select the maximum number of performances
*  that can be scheduled on the stage.
* Your goal is to determine the largest possible number of non-overlapping performances.
*/
public class AssignPerformance {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr =new int [n][2];
        for(int i= 0; i < arr.length; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int total = 1;
        int i = 1;
        int e = 0;
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        while(i < arr.length){
            if(arr[i][0] >= arr[e][1]){
                e = i;
                i++;
                total++;
            }
            else i++;
        }
        System.out.print(total);
    }
}
