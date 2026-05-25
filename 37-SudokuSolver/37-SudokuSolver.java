// Last updated: 5/25/2026, 11:13:04 AM
class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isValid(board, row, col, num)) {

                            // CHOOSE
                            board[row][col] = num;

                            // EXPLORE
                            if (solve(board)) {
                                return true;
                            }

                            // UNDO (Backtrack)
                            board[row][col] = '.';
                        }
                    }

                    return false; // no valid number found
                }
            }
        }

        return true; // board completely filled
    }

    private boolean isValid(char[][] board, int row, int col, char num) {

        for (int i = 0; i < 9; i++) {

            // Check row
            if (board[row][i] == num) return false;

            // Check column
            if (board[i][col] == num) return false;

            // Check 3x3 box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == num) return false;
        }

        return true;
    }
}