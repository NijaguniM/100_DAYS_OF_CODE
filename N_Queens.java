/*
The N-Queens Problem is a problem where you have a chessboard with N x N squares,
and you need to place N queens on the board such that no queen attacks any other queen.
A queen can attack another queen if they are in the same row, column, or diagonal.


*/ 

public class N_Queens {
    
        public static void solveNQueens(int n) {
            boolean[][] board = new boolean[n][n];
            solveNQueensHelper(board, 0);
        }
    
        private static void solveNQueensHelper(boolean[][] board, int row) {
            if (row == board.length) {
                // Print the solution
                printBoard(board);
                return;
            }
    
            for (int col = 0; col < board.length; col++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = true;
                    solveNQueensHelper(board, row + 1);
                    board[row][col] = false; // backtrack
                }
            }
        }
    
        private static boolean isSafe(boolean[][] board, int row, int col) {
            for (int i = 0; i < row; i++) {
                if (board[i][col]) return false; // same column
                if (col - (row - i) >= 0 && board[i][col - (row - i)]) return false; // upper left diagonal
                if (col + (row - i) < board.length && board[i][col + (row - i)]) return false; // upper right diagonal
            }
            return true;
        }
    
        private static void printBoard(boolean[][] board) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) System.out.print("Q ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            solveNQueens(4); // Solve for 4x4 board
        }
    
}
