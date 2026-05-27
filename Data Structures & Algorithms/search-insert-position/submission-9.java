class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 , high = nums.length-1 , mid = 0;
        int notFoundIndex = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            System.out.println(low + " -- " + high +"---"+mid);
            if(nums[mid]==target) return mid;
            if(low==high) break;
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            } 
        }
        return nums[low] > target ? low : low+1;
    }
}