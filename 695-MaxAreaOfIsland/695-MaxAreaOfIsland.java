// Last updated: 5/25/2026, 11:09:19 AM
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int tem=dfs(grid,i,j);
                area=Math.max(tem,area);
            }
        }
        return area;
    }
    private int dfs(int[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j]=0;
        int a=1;
        a+=dfs(grid,i+1,j);
        a+=dfs(grid,i,j+1);
        a+=dfs(grid,i-1,j);
        a+=dfs(grid,i,j-1);
        return a;
    }
}