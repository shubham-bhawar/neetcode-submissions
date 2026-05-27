class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] ans = new int[2];
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            indexMap.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            if(indexMap.get(target-nums[i])!=null){
            int rightIndex = indexMap.get(target-nums[i]);
            if(rightIndex!=i){
                ans[0]=i;
                ans[1]=rightIndex;
                break;
            }
            }
        }
    return ans;
    }
}
