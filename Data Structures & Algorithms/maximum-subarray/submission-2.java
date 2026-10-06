class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum  = 0 , maxS = nums[0];
        for(int x : nums){
            if(runningSum<0){
                runningSum=0;
            }
            runningSum += x ;

            maxS = Math.max(runningSum , maxS);
        }
        return maxS;
    }

    // public int maxSubArray(int[] nums) {
    //     int[] max = nums.clone();

    //     for(int i=1 ; i<nums.length ; i++){
    //         max[i] = Math.max(nums[i],nums[i]+max[i-1]);
    //     }
    //     int maxS= max[0];
    //     for(int x : max){
    //         maxS = Math.max(maxS,x);
    //     }
    //     return maxS;
    // }

}
