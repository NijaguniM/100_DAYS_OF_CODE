/*
 The Sudoku Solver uses a backtracking algorithm to find a solution. Here's a step-by-step breakdown of the algorithm:

Initialization: Create a 9x9 Sudoku board and initialize it with the given values.
Find an empty cell: Iterate through the board to find an empty cell (represented by 0).
Try numbers 1-9: For each empty cell, try placing numbers 1-9 in that cell.
Check validity: For each number, check if it's valid to place it in the cell by calling the isValid method.
Recursively solve: If the number is valid, recursively call the solve method to try to fill in the rest of the board.
Backtrack: If the recursive call returns false, it means that the current number doesn't lead to a solution. So, we reset the cell to 0 and try the next number.
Return solution: If the recursive call returns true, it means we've found a solution. Return true to indicate that a solution exists.
*/

public class SudokuSolver {
        private int[][] board;
    
        public SudokuSolver(int[][] board) {
            this.board = board;
        }
    
        private boolean isValid(int row, int col, int num) {
            // Check row and column
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == num || board[i][col] == num) {
                    return false;
                }
            }
    
            // Check 3x3 box
            int boxRow = row - row % 3;
            int boxCol = col - col % 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[boxRow + i][boxCol + j] == num) {
                        return false;
                    }
                }
            }
            return true;
        }
    
        private boolean solve(int row, int col) {
            if (row == 9 - 1 && col == 9) {
                return true; // Solution found
            }
    
            if (col == 9) {
                row++;
                col = 0;
            }
    
            if (board[row][col] != 0) {
                return solve(row, col + 1);
            }
    
            for (int num = 1; num <= 9; num++) {
                if (isValid(row, col, num)) {
                    board[row][col] = num;
                    if (solve(row, col + 1)) {
                        return true;
                    }
                    board[row][col] = 0; // Backtrack
                }
            }
            return false;
        }
    
        public void printBoard() {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int[][] board = {
                    {5, 3, 0, 0, 7, 0, 0, 0, 0},
                    {6, 0, 0, 1, 9, 5, 0, 0, 0},
                    {0, 9, 8, 0, 0, 0, 0, 6, 0},
                    {8, 0, 0, 0, 6, 0, 0, 0, 3},
                    {4, 0, 0, 8, 0, 3, 0, 0, 1},
                    {7, 0, 0, 0, 2, 0, 0, 0, 6},
                    {0, 6, 0, 0, 0, 0, 2, 8, 0},
                    {0, 0, 0, 4, 1, 9, 0, 0, 5},
                    {0, 0, 0, 0, 8, 0, 0, 7, 9}
            };
            SudokuSolver solver = new SudokuSolver(board);
            if (solver.solve(0, 0)) {
                solver.printBoard();
            } else {
                System.out.println("No solution exists");
            }
        }
}
