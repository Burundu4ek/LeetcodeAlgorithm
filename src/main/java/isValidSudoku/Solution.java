package isValidSudoku;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] сube1 = new int[board.length];
        int[] сube2 = new int[board.length];
        int[] сube3 = new int[board.length];

        for (int i = 0; i < board.length; i++) {
            int[] row = new int[board.length];
            int[] column = new int[board.length];

            if (i % 3 == 0 && i > 0) {
                сube1 = new int[board.length];
                сube2 = new int[board.length];
                сube3 = new int[board.length];
            }

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    if (row[val] == 1) return false;
                    else row[val] = 1;

                    if (j < 3) {
                        if (сube1[val] == 1) return false;
                        else сube1[val] = 1;
                    } else if (j < 6) {
                        if (сube2[val] == 1) return false;
                        else сube2[val] = 1;
                    } else {
                        if (сube3[val] == 1) return false;
                        else сube3[val] = 1;
                    }
                }

                if (board[j][i] != '.') {
                    if (column[board[j][i] - 49] == 1) return false;
                    else column[board[j][i] - 49] = 1;
                }

            }
        }

        return true;
    }
}
