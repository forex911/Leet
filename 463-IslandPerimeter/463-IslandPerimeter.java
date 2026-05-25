// Last updated: 5/25/2026, 11:09:49 AM
class Solution {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int per=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                per=dfs(grid,i,j);
                }
            }
        }
        return per;
    }
    private int dfs(int[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 1;
        }

        // If water → contributes 1
        if(grid[i][j] == 0) {
            return 1;
        }

        // If already visited → contributes 0
        if(grid[i][j] == -1) {
            return 0;
        }

        // Mark visited
        grid[i][j] = -1;

        int peri = 0;

        peri+=dfs(grid,i+1,j);
        peri+=dfs(grid,i,j+1);
        peri+=dfs(grid,i-1,j);
        peri+=dfs(grid,i,j-1);
        return peri;
    }
}