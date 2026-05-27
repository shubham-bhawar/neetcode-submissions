class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> res = new ArrayList<>();
        f(nums, 0, nums.length,ans,res,target);
        return ans;
    }

    void f(int [] nums , int idx , int size , List<List<Integer>> ans ,List<Integer> res,int target){
        
        if(idx==size){
            if(target==0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        res.add(nums[idx]);
        if(target>=nums[idx]) f(nums , idx , size , ans ,res,target-nums[idx]);

        res.remove(res.size()-1);
        f(nums , idx+1 , size , ans ,res,target);
    }   
}
