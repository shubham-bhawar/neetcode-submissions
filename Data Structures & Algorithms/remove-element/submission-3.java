class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int length = nums.length;
        int right = length-1;
        while(left < right){
            while(left < length && val != nums[left]){
                left++;
            }
            while(right > left && val == nums[right]){
                right--;
            }
            if(left < length && right>0){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            }
            
        }
        for(int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
        int count = 0;
        for(int x : nums){
            if(x==val){
                break;
            }
            count++;
        }
        System.out.println(count);
        return count;
    }
}