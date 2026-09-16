class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i]== nums[i-1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j+1;
                int l = nums.length-1;
                long sum = (long) nums[i] + nums[j];
                while(k<l){
                    long s = (long) nums[k]+nums[l];
                    if(s == (target-sum)){
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        k++;
                        l--;
                    }else if(s < (target-sum)){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}