class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        int[][] vis = new int[r][c];
        for (int i = 0; i < c; i++) {
            if (board[0][i] == 'O')
                dfs(board, vis, 0, i);
        }
        for (int i = 1; i < r; i++) {
            if (board[i][c - 1] == 'O')
                dfs(board, vis, i, c - 1);
        }
        for (int i = c - 2; i >= 0; i--) {
            if (board[r - 1][i] == 'O')
                dfs(board, vis, r - 1, i);
        }
        for (int i = r - 2; i >= 1; i--) {
            if (board[i][0] == 'O')
                dfs(board, vis, i, 0);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
    public void dfs(char[][] board, int[][] vis, int i, int j) {
        int r = board.length;
        int c = board[0].length;
        vis[i][j] = 1;
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int nr = i + dr[k];
            int nc = j + dc[k];
            if (nr >= 0 && nr < r && nc >= 0 && nc < c && vis[nr][nc] == 0 && board[nr][nc] == 'O') {
                dfs(board, vis, nr, nc);
            }
        }
    }
}
