class Solution {
    public boolean isValidSudoku(char[][] board) {

        // ---------- Check every row ----------
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];

            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

                if (ch != '.') {
                    int num = ch - '1';

                    if (seen[num]) {
                        return false;
                    }

                    seen[num] = true;
                }
            }
        }

        // ---------- Check every column ----------
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];

            for (int i = 0; i < 9; i++) {
                char ch = board[i][j];

                if (ch != '.') {
                    int num = ch - '1';

                    if (seen[num]) {
                        return false;
                    }

                    seen[num] = true;
                }
            }
        }

        // ---------- Check every 3x3 box ----------
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                boolean[] seen = new boolean[9];

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        char ch = board[i][j];

                        if (ch != '.') {
                            int num = ch - '1';

                            if (seen[num]) {
                                return false;
                            }

                            seen[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}