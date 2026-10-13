class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] ind = new int[n+1];
        int[] out = new int[n+1];
       
        for(int [] pair : trust){
            ind[pair[1]]++;
            out[pair[0]]++;
        }
        int ans = -1;
        for(int i =1 ;i<=n;i++){
            if(ind[i]==n-1 && out[i]==0) ans = i;
        }

        return ans;
    }
}