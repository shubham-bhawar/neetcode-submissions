class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x , int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> b.y-a.y);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }

        int [] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i]=pq.poll().x;
        }
    return ans;
    }
}
