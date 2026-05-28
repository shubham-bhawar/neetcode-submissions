class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] pick = new boolean[nums.length];
        perm(nums, ans, nums.length, temp,pick);
        return ans;
    }

    private void perm(
        int[] nums, List<List<Integer>> ans, int n, List<Integer> temp, boolean[] pick) {
        if (temp.size() == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!pick[i]) {
                temp.add(nums[i]);
                pick[i]=true;
                perm(nums, ans, n, temp,pick);
                temp.remove(temp.size() - 1);
                pick[i]= false;
            }
        }
    }
}
