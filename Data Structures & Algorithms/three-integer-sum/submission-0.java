class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> ans = new HashMap<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0 ;i<n;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i =0 ; i< n ; i++){
            ans.put(nums[i],ans.get(nums[i])-1);
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1 ; j<n;j++){
                ans.put(nums[j],ans.get(nums[j])-1);
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int target = -(nums[i]+nums[j]);

                if(ans.getOrDefault(target,0)>0){
                    res.add(Arrays.asList(nums[i],nums[j],target));
                }
            }
            for(int j = i+1 ; j<n;j++){
            ans.put(nums[j],ans.get(nums[j])+1);
            }
        }
        return res;
    }
}
