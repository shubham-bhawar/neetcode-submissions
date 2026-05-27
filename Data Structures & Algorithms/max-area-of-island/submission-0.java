class Solution {
     private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int r= grid.length , c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        int max = 0;
        int[] area = new int[1];
        area[0]=0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    area[0]=0;
                    countInsland(grid,vis,i,j,r,c,area);
                    max=Math.max(max,area[0]);
                }
            }
        }
        return max;
    }
    class Pair{
        int x;
        int y;
        Pair(int x ,int y){
            this.x=x;
             this.y=y;
        }
    }

    void countInsland(int[][] grid,boolean[][] vis,int k,int l,int r ,int c  ,int[] area ){
        vis[k][l]=true;
        area[0]+= grid[k][l];
        for (int[] dir : directions) {
                if(dir[0]+k<r && dir[0]+k>=0 && dir[1]+l<c && dir[1]+l>=0 && !vis[dir[0]+k][dir[1]+l] && grid[dir[0]+k][dir[1]+l]==1){
                    countInsland(grid,vis,dir[0]+k,dir[1]+l,r,c,area);
                }
        } 
    }  
}
