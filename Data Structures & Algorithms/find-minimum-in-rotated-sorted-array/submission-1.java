class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        if (nums[s] < nums[e])
            return nums[s];
        int ans = nums[0];
        while (s <= e) {
            if (nums[s] < nums[e]) {
                ans = Math.min(ans, nums[s]);
                break;
            }

            int m = (s + e) / 2;
            ans = Math.min(ans, nums[m]);
            if (nums[m] >= nums[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
