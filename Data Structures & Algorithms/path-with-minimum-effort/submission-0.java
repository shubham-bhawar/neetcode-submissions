class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.dist-b.dist);
        int n = heights.length;
        int m = heights[0].length;
        int[][] pathMaxEffort = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                pathMaxEffort[i][j]=(int)(1e9);
            }
        }
        pathMaxEffort[0][0]=0;
        pq.offer(new Node(0,0,0));
        int [] dr = {1,0,-1,0};
        int [] dc = {0,1,0,-1};
        while(!pq.isEmpty()){

            Node temp = pq.remove();
            int dist = temp.dist;
            int r = temp.row;
            int c = temp.col;
            if(r == n-1 && c == m-1) return dist;
            for(int i = 0 ;i< 4;i++){

                int nr = r+dr[i];
                int nc = c + dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc < m){
                    int maxDiff = Math.max(Math.abs(heights[nr][nc]-heights[r][c]),dist);
                    if(maxDiff<pathMaxEffort[nr][nc]){
                        pathMaxEffort[nr][nc] = maxDiff;
                        pq.offer(new Node(maxDiff,nr,nc));
                    }
                }
            }
        }
        return -1;
    }
}

class Node{
    int dist;
    int row;
    int col;
    Node(int dist , int row , int col){
        this.dist= dist ;
        this.row = row ;
        this.col = col;
    }
}