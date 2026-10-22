class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Dis ds = new Dis(edges.length+1); 
        int [] ans = new int[2];
        int x = 0 , y =0;
        for(int i = 0 ;i<edges.length;i++){
            if(ds.unionBySize(edges[i][0],edges[i][1])==-1){
                x = edges[i][0];
                y=edges[i][1];
            }
        }
        ans[0] = x;
        ans[1] = y;
        return ans;
    }


}

class Dis {

    List<Integer> par = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    Dis(int n) {
        for (int i = 0; i < n; i++) {
            par.add(i);
            size.add(1);
        }
    }

    public int findUltParent(int x) {

        if (par.get(x) == x)
            return x;
        int ult = findUltParent(par.get(x));
        par.set(x, ult);
        return par.get(x);

    }

    public int unionBySize(int u,int v){

            int ulp_u = findUltParent(u);
            int ulp_v = findUltParent(v);
            if(ulp_u == ulp_v) return -1;
            if(size.get(ulp_u)<size.get(ulp_v)){
                par.set(ulp_u,ulp_v);
                size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
            }else{
                par.set(ulp_v,ulp_u);
                size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
            }
            return 0;
        }

}

