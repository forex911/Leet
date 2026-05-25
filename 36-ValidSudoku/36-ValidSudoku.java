// Last updated: 5/25/2026, 11:13:05 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> check=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                if(check.contains(board[i][j])) return false;
                check.add(board[i][j]);
            }

        }
        for(int i=0;i<board.length;i++){
            HashSet<Character> check=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[j][i]=='.') continue;
                if(check.contains(board[j][i])) return false;
                check.add(board[j][i]);
            }
            
        }
        for(int i=0;i<9;i+=3){
            
            for(int j=0;j<9;j+=3){
                HashSet<Character> check=new HashSet<>();
                for(int n=i;n<i+3;n++){
                    for(int m=j;m<j+3;m++){
                        if(board[n][m]=='.') continue;
                        if(check.contains(board[n][m])) return false;
                          check.add(board[n][m]);
                    }
                }
              
            }
        }
        return true;
    }
}