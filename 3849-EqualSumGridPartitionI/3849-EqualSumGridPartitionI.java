// Last updated: 5/25/2026, 11:06:51 AM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long tot=0;
        for(int[] row:grid){
            for(int i:row){
                tot+=i;
            }
        }
        if (tot % 2 != 0) return false;
        long rowtot=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                rowtot+=grid[i][j];
            }
            if(rowtot==(tot-rowtot))return true;
        }
        long coltot=0;
        for(int j=0;j<m-1;j++){
            for(int i=0;i<n;i++){
                coltot+=grid[i][j];
            }
            if(coltot==(tot-coltot))return true;
        }
        return false;
    }
}