class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) res++;
            }
        }
        return res;
    }

    int f(int[] nums, int sum , int idx , int size){
        if(idx == size){
            if(sum == 0){
              return 1;  
            }
            else{
                return 0;
            }
        }
        return f(nums,sum-nums[idx], idx+1,size) + f(nums,sum,idx+1,size);
    }
}