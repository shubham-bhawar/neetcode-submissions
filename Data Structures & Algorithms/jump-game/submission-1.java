class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (max <= i) {
                return false;
            }
        }

        return true;
    }
}
