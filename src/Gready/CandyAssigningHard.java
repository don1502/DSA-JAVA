package Gready;

// https://leetcode.com/problems/candy/
// Leetcode problem 135. Candy

import java.util.*;

public class CandyAssigningHard {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Total candies needed are " + candy(arr));
    }

    // Main Leetcode function....

    static int candy(int[] ratings) {
        int n = ratings.length;
        int [] arr = new int [n];
        Arrays.fill(arr, 1);
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }

}
