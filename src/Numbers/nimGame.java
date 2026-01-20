package Numbers;

// https://leetcode.com/problems/nim-game/
// Leetcode problem 292. Nim Game

import java.util.Scanner;

public class nimGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();

        System.out.println("Can I win the game for the given number of stones " + canWinNim(n));
    }

    // Main leetcode function...

    static boolean canWinNim(int n) {
        return n%4 !=0;
        // If n is a multiple of 4, then no matter what you remove (1/2/3),
        // the opponent can always remove stones in such a way that you will lose.

        // This the simplest way to find whether we will win the game or not using modulo 4...
    }

}

/*
You are playing the following Nim Game with your friend:

Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
*/

