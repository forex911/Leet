// Last updated: 5/25/2026, 11:08:00 AM
class Solution {
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[][] max=new long[n][m];
        long [][] min=new long[n][m];
        max[0][0]=grid[0][0];
        min[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            max[i][0]=max[i-1][0]*grid[i][0];
            min[i][0]=max[i][0];
        }
        for(int j=1;j<m;j++){
            max[0][j]=max[0][j-1]*grid[0][j];
            min[0][j]=max[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                long tem=grid[i][j];
                long a=tem*max[i][j-1];
                long b=tem*max[i-1][j];
                long c=tem*min[i][j-1];
                long d=tem*min[i-1][j];
                max[i][j]=Math.max(Math.max(a,c),Math.max(b,d));
                min[i][j]=Math.min(Math.min(a,c),Math.min(b,d));
            }
        }
        long res = max[n-1][m-1];
        if (res < 0) return -1;
        return (int)(res % 1000000007);
    }
}