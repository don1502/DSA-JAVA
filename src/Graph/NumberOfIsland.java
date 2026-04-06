package Graph;

// https://leetcode.com/problems/number-of-islands/
// Leetcode problem 200. Number of Islands

public class NumberOfIsland {
    public static void main(String[] args) {

    }

    // Main Leetcode function...

    private void dfs(char[][] grid,int i,int j){
        int n=grid.length,m=grid[0].length;
        //checking valid boundary
        if(i<0 || i==n || j<0 || j==m || grid[i][j]=='0') return ;

        grid[i][j]='0';
        // now traversing in all possible directions
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }

        }
        return count;

    }

}
