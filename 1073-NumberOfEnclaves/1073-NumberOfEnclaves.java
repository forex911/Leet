// Last updated: 5/25/2026, 11:08:27 AM
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                dfs(i,0,grid);
            }
            if(grid[i][m-1]==1){
                dfs(i,m-1,grid);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(0,i,grid);
            }
            if(grid[n-1][i]==1){
                dfs(n-1,i,grid);
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(int i,int j,int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        if(i>=n || j>=m || i<0 || j<0 || grid[i][j]!=1) return;
        grid[i][j]=2;
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }
}