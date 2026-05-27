class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int x : nums){
            if(ans.contains(x)) return x;
            ans.add(x);
        }
        return -1;
    }
}
