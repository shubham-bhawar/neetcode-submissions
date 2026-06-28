class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(1,n,k,new ArrayList<>() , ans);
        return ans;
    }

    void subsets(int start , int n , int size , List<Integer> temp ,List<List<Integer>> ans ){
        if(temp.size() == size){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(start<=n){
        temp.add(start);
        subsets(start+1,n,size,temp,ans);
        temp.remove(temp.size()-1);
        subsets(start+1,n,size,temp,ans);
        }
    }

}