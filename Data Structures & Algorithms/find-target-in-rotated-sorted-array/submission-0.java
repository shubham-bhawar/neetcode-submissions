class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        
        while(s<=e){
            int mid = (e+s)/2;
            if(nums[s]<= nums[mid]){
                if(target == nums[mid]) return mid;
                else if(target >= nums[s] && target <= nums[mid]){
                    e= mid;
                }else{
                    s=mid+1;
                }
            }else{
                if(target == nums[mid]) return mid;
                else if(target >= nums[mid] && target <= nums[e]){
                    s= mid;
                }else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}
