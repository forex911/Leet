// Last updated: 5/25/2026, 11:07:27 AM
class Solution {
    static char[][] grid;
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        grid=new char[m][n];
        for (int i = 0; i < m; i++) {
        Arrays.fill(grid[i], '.');
    }
        for(int[] g:guards){
            int i=g[0];
            int j=g[1];
            grid[i][j]='G';
        }
        for(int[] w:walls){
            int i=w[0];
            int j=w[1];
            grid[i][j]='W';
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[i][j]=='G'){
                    travel(i,j,m,n);
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='.'){
                    res++;
                }
            }
        }
        return res;
    }
    private static void travel(int r,int c,int m,int n){
        for(int i=r-1;i>=0;i--){
            if(grid[i][c]=='W' || grid[i][c]=='G' ){
                break;
            }
            if(grid[i][c] == '.') grid[i][c] = 'V';
        }
        for(int i=r+1;i<m;i++){
            if(grid[i][c]=='W' || grid[i][c]=='G'){
                break;
            }
            if(grid[i][c] == '.') grid[i][c] = 'V';
        }
        for(int i=c-1;i>=0;i--){
            if(grid[r][i]=='W' || grid[r][i]=='G'){
                break;
            }
            if(grid[r][i] == '.') grid[r][i] = 'V';
        }
        for(int i=c+1;i<n;i++){
            if(grid[r][i]=='W' || grid[r][i]=='G'){
                break;
            }
            if(grid[r][i] == '.') grid[r][i] = 'V';
        }
    }
}