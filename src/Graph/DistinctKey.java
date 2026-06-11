package Graph;

// https://leetcode.com/problems/keys-and-rooms/
// Leetcode problem 841. Keys and Rooms

import java.util.*;

public class DistinctKey {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visted = new boolean[n];

        dfs(0, rooms,visted);
        for(int i=0; i<n; i++){
            if(!visted[i]) return false;
        }
        return true;
    }
    private static void dfs(int node, List<List<Integer>> rooms, boolean[] visted ){
        visted[node] = true;
        for(int i: rooms.get(node)){
            if(!visted[i]){
                dfs(i, rooms, visted);
            }
        }
    }

}
