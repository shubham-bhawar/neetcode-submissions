class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int [] postMulti = new int[n];
        int [] preMulti = new int[n];
        preMulti[0] = nums[0];
        postMulti[n-1]=nums[n-1];
        for(int i =1 ;i<n;i++){
            preMulti[i]=preMulti[i-1] * nums[i];
        }
        for(int i =n-2 ;i>=0;i--){
            postMulti[i] = postMulti[i+1] * nums[i];
        }
        for(int i =0 ;i<n;i++){
            if(i==0) nums[i] = postMulti[i+1];
            else if(i==n-1) nums[i] = preMulti[i-1];
            else  nums[i] = postMulti[i+1] * preMulti[i-1];

        }
        return nums;
    }
}  
