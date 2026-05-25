// Last updated: 5/25/2026, 11:07:03 AM
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>0) grid[i][j]+=grid[i-1][j];
                if(j>0) grid[i][j]+=grid[i][j-1];
                if(i>0 && j>0) grid[i][j]-=grid[i-1][j-1];
                if(grid[i][j]<=k) res++;
            }
        }
        return res;
    }
}