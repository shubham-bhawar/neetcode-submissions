class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        f(nums, 0, nums.length,ans,res,target);
        return new ArrayList<>(ans);
    }

    void f(int [] nums , int idx , int size , Set<List<Integer>> ans ,List<Integer> res,int target){
        
        if(idx==size){
            if(target==0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        
        res.add(nums[idx]);
        f(nums , idx+1 , size , ans ,res,target-nums[idx]);

        res.remove(res.size()-1);
        f(nums , idx+1 , size , ans ,res,target);
    }   
}