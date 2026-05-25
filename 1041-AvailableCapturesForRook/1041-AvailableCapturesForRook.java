// Last updated: 5/25/2026, 11:08:28 AM
class Solution {
    public int numRookCaptures(char[][] board) {
        int res=0;
        int n=board.length,m=board[0].length;
        int p1=0,p2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='R'){
                    p1=i;
                    p2=j;
                }
            }
        }
        for(int i=p1;i>=0;i--){
            if(board[i][p2]=='B'){
                break;
            }
            if(board[i][p2]=='p') {
                res++;
                break;}
        }
        for(int i=p2;i>=0;i--){
            if(board[p1][i]=='B'){
                break;
            }
            if(board[p1][i]=='p') {
                res++;
                break;}
        }
        for(int i=p1;i<n;i++){
            if(board[i][p2]=='B'){
                break;
            }
            if(board[i][p2]=='p') {
                res++;
                break;}
        }
        for(int i=p2;i<m;i++){
            if(board[p1][i]=='B'){
                break;
            }
            if(board[p1][i]=='p') {
                res++;
                break;}
        }
        return res;
    }
}