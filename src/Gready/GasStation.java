package Gready;

// https://leetcode.com/problems/gas-station/
// Leetcode problem 134. Gas Station

import java.util.*;

public class GasStation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int gas[] = new int[n];
        int cost[] = new int[n];
        for(int i = 0; i < n; i++) gas[i] = input.nextInt();
        for(int i = 0; i < n; i++) cost[i] = input.nextInt();
        System.out.println("Starting gas station is " + canCompleteCircuit(gas, cost));
    }

    // Main leetcode function..

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        int start = 0;
        int tank = 0;
        for(int i = 0; i < n - 1; i++){
            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
        return start;
    }

}
