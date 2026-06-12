package Graph;

// https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/
// Leetcode problem 2658. Maximum Number of Fish in a Grid

import java.util.Scanner;

public class MaximumNumberOfFish {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Maximum number of fishes are " + findMaxFish(arr));
    }

    // Main leetcode function.....

    static int findMaxFish(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean [][] visited = new boolean[r][c];
        int maxFish = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] > 0 && !visited[i][j]){
                    int fish = DFS(grid, visited, i, j);
                    maxFish = Math.max(maxFish, fish);
                }
            }
        }
        return maxFish;
    }

    static int DFS(int [][] grid, boolean [][] visited, int r, int c){
        if(r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] == 0) return 0;
        if(visited[r][c]) return 0;
        visited[r][c] = true;
        int fish = grid[r][c];
        // Checking all direction from the fish location
        fish += DFS(grid, visited, r-1, c);
        fish += DFS(grid, visited, r+1, c);
        fish += DFS(grid, visited, r, c-1);
        fish += DFS(grid, visited, r, c+1);
        return fish;
    }

}
