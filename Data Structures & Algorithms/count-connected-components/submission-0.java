class Solution {
    public int countComponents(int n, int[][] edges) {
        Dis ds = new Dis(n); 
        for(int i = 0 ;i<edges.length;i++){
            int u = edges[i][0];
            int v= edges[i][1];
            ds.unionBySize(u,v);
        }
        int ans =0; 
        for(int i =0;i<n;i++){
            if(ds.findUltParent(i)==i) ans++;
        }
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

    public void unionBySize(int u,int v){

            int ulp_u = findUltParent(u);
            int ulp_v = findUltParent(v);
            if(ulp_u == ulp_v) return;
            if(size.get(ulp_u)<size.get(ulp_v)){
                par.set(ulp_u,ulp_v);
                size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
            }else{
                par.set(ulp_v,ulp_u);
                size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
            }
        }

}
