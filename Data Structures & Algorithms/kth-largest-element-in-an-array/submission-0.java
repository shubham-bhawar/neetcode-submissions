class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(int x: nums) ans.offer(x);
        int res = 0;
        while(k != 0){
            res = ans.poll();
            k--;
        }
        return res;
    }
}
