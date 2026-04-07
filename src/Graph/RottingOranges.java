package Graph;

// https://leetcode.com/problems/rotting-oranges/
// Leetcode problem 994. Rotting Oranges

import java.util.*;

public class RottingOranges {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int time=0;
        int[] d1={-1,0,1,0};
        int[] d2={0,1,0,-1};
        int cntFresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                else if(grid[i][j] != 0){
                    cntFresh++;
                }

            }
        }
        if(cntFresh==0){
            return 0;
        }
        int cnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                Pair p=q.remove();
                for(int j=0;j<d1.length;j++){
                    int x=p.x+d1[j];
                    int y=p.y+d2[j];
                    if(x >= 0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y] != 2 && grid[x][y] != 0){
                        grid[x][y]=2;
                        q.add(new Pair(x,y));
                        cnt++;
                    }
                }
            }
        }
        if(cntFresh > cnt){
            return -1;
        }
        return time-1;

    }

}
