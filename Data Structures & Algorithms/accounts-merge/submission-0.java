class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        Dis ds = new Dis(n);

        Map<String,Integer> map = new HashMap<>();

        for(int i =0 ;i<n;i++){
            for(int j = 1;j<accounts.get(i).size();j++){
                String node = accounts.get(i).get(j);
                if(map.containsKey(node)){
                    ds.unionBySize(i,map.get(node));
                }else{
                    map.put(accounts.get(i).get(j),i);
                }
            }
        }

        ArrayList<String>[] list = new ArrayList[n];

        for(int i =0 ;i< n ;i++){
            list[i] = new ArrayList<String>();
        }

        for(Map.Entry<String,Integer> entri : map.entrySet()){
            String key = entri.getKey();
            int val = ds.findUltParent(entri.getValue());
            list[val].add(key);
        }

        List<List<String>> ans = new ArrayList<>();
        for(int i =0 ;i<n;i++){
            int sz = list[i].size();
            if(sz==0) continue;
            Collections.sort(list[i]);
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(int j =0;j<sz;j++){
                temp.add(list[i].get(j));
            }
            ans.add(temp);
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

            if(size.get(ulp_u)<size.get(ulp_v)){
                par.set(ulp_u,ulp_v);
                size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
            }else{
                par.set(ulp_v,ulp_u);
                size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
            }
        }

}