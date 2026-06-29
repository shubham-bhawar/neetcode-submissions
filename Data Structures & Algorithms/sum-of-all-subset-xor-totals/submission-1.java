class Solution {
    public int subsetXORSum(int[] nums) {
        List<Integer> res = new ArrayList<>();
        subsets(nums , 0 , new ArrayList<>(),res);
        int sum = 0;
        for(int x : res){
            sum+=x;
        }
        return sum;
    }

    void subsets(int [] nums , int ind , List<Integer> temp ,List<Integer> res ){
        if(ind == nums.length){
            int xor = 0;
            for(int x : temp){
                xor^= x;
            }
            res.add(xor);
            return;
        }

        temp.add(nums[ind]);
        subsets(nums,ind+1,temp,res);
        temp.remove(temp.size()-1);
        subsets(nums,ind+1,temp,res);

    }




}