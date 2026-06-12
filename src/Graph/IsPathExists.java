package Graph;

// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Leetcode problem 1971. Find if Path Exists in Graph

import java.util.*;

public class IsPathExists {
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
        int sour = input.nextInt();
        int dest = input.nextInt();
        System.out.println("Is path exists from  source to destination " + validPath(n, arr, sour, dest));
    }

    // Main Leetcode function....

    static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        // Create empty list for each node
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // Add edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // because undirected graph
        }
        boolean [] visited = new boolean[n];
        return DFS(source, destination, adj, visited);
    }
    static boolean DFS(int source, int destination, List<List<Integer>> list, boolean[] visited){
        if(source == destination) return true;
        visited[source] = true;
        for(int i : list.get(source)){
            if(!visited[i]){
                if(DFS(i, destination, list, visited)) return true;
            }
        }
        return false;
    }

}
