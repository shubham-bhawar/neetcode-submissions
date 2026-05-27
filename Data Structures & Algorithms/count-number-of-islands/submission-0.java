class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    class Pair{
        int x;
        int y;
        Pair(int x ,int y){
            this.x=x;
             this.y=y;
        }
    }
    public int numIslands(char[][] grid) {
        int r= grid.length , c = grid[0].length;
        boolean[][] vis = new boolean[r][c];

        int island = 0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    island++;
                    countInsland(grid,vis,i,j,r,c);
                }
            }
        }
        return island;
    }

    void countInsland(char[][] grid,boolean[][] vis,int k,int l,int r ,int c){
        vis[k][l]=true;
        for (int[] dir : directions) {
                if(dir[0]+k<r && dir[0]+k>=0 && dir[1]+l<c && dir[1]+l>=0 && !vis[dir[0]+k][dir[1]+l] && grid[dir[0]+k][dir[1]+l]=='1'){
                    countInsland(grid,vis,dir[0]+k,dir[1]+l,r,c);
                }
        } 
    }
}
