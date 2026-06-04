package Gready;

// https://leetcode.com/problems/maximum-matching-of-players-with-trainers/
// Leetcode problem no. 2410. Maximum Matching of Players With Trainers

import java.util.*;

public class PlayersWithTrainer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number of elements: ");
        int m = input.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Matched players and traiiners = " + matchPlayersAndTrainers(arr, arr1));
    }

    // Main Leetcode function....

    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        int j = i;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]) i++;
            j++;
        }
        return i;
    }

}
