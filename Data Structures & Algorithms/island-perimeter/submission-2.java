class Solution {
    class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    public int islandPerimeter(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        q.clear();
        int flag = 0;
        int[][] vis = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Pair(i, j));
                    vis[i][j]=1;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        int peri = 0;
        while (!q.isEmpty()) {
            Pair ele = q.poll();
            int row = ele.x;
            int col = ele.y;
            vis[row][col] = 1;
            // top , bottom , left , righ
            int[] delrow = {-1, +1, 0, 0};
            int[] delcol = {0, 0, -1, +1};

            for (int k = 0; k < 4; k++) {
                int x = row + delrow[k];
                int y = col + delcol[k];
                if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
                    peri += 1;
                }else if(vis[x][y]==0){
                    vis[x][y]=1;
                    q.offer(new Pair(x,y));
                }
            }
        }
        return peri;
    }
}