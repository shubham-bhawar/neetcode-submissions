class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> res = new ArrayList<>();
        f(nums, 0, nums.length,ans,res);
        return ans;
    }

    void f(int [] nums , int idx , int size , List<List<Integer>> ans ,List<Integer> res){
        
        if(idx==size){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[idx]);
        f(nums , idx+1 , size , ans ,res);

        res.remove(res.size()-1);
        f(nums , idx+1 , size , ans ,res);
    }
}
