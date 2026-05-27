class Solution {

    public final int [][] direction = {{-1,0},{1,0},{0,1},{0,-1}};
    
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
    int r = grid.length,c=grid[0].length;
    boolean[][] gridRotten = new boolean[r][c];
    int count =0;
    Queue<Pair> q = new LinkedList<>();
    for(int i =0 ; i<r;i++){
        for(int j =0 ; j<c;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j));
            }
        }
    }

    while(!q.isEmpty()){
        int size = q.size();
        while(size!=0){
            Pair temp = q.remove();
            for(int[] dir : direction){
                if(dir[0]+temp.x>=0 && dir[0]+temp.x<r && dir[1]+temp.y>=0 && dir[1]+temp.y<c && grid[dir[0]+temp.x][dir[1]+temp.y]==1){
                        grid[dir[0]+temp.x][dir[1]+temp.y]=2;
                        q.add(new Pair(dir[0]+temp.x,dir[1]+temp.y));
                    }
                }
            size--;
        }
        count++;
    }
    for(int i =0 ; i<r;i++){
        for(int j =0 ; j<c;j++){
            if(grid[i][j]==1){
                return -1;
            }
        }
    }

    return count ==0 ? 0 : count-1 ;

    }
}
