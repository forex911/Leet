// Last updated: 5/25/2026, 11:07:06 AM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] res=new int[n][m];
        int mod=12345;
        long pre=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(int) pre;
                pre=(pre*grid[i][j])%mod;
            }
        }
        long suf=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                res[i][j] =(int) (suf*res[i][j])%mod;
                suf=(suf*grid[i][j])%mod;
            }
        }
        return res;
    }
}