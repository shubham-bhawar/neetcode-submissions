class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int i= 0  , n = nums.length;
      if(n==1) return false;
      while(i < n-1){
        int j = i+1;
        while(j<n && Math.abs(j-i)<=k){
            if(nums[i]==nums[j]){
                return true;
            }
            j++;
        }
        i++; 
      }
      return false;  
    }
}