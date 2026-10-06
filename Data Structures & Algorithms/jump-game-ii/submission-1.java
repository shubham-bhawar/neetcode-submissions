class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int low = 0;
        int high = 0;
        int n = nums.length - 1;
        while (high < n) {
            int jump = 0;
            for (int i = low; i <= high; i++) {
                jump = Math.max(jump , i+nums[i]);
            }

            low = high+1;
            high = jump;
            count+=1;
        }
        return count;
    }
}
