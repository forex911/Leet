// Last updated: 5/25/2026, 11:11:43 AM
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(n,m,i,0,board);
            }
            if(board[i][m-1]=='O'){
                dfs(n,m,i,m-1,board);
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(n,m,0,i,board);
            }
            if(board[n-1][i]=='O'){
                dfs(n,m,n-1,i,board);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }
                else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    private void dfs(int n,int m,int i,int j,char[][] board){
        if(i>=n || j>=m || i<0 || j<0 || board[i][j]!='O'){
            return;
        }
        board[i][j]='T';
        dfs(n,m,i+1,j,board);
        dfs(n,m,i-1,j,board);
        dfs(n,m,i,j+1,board);
        dfs(n,m,i,j-1,board);
    }
}