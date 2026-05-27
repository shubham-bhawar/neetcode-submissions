class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int loop = 0;
    public KthLargest(int k, int[] nums) {
        for(int x : nums) pq.offer(x);
        loop=k;
        
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>loop){
            pq.poll();
        }
        return pq.peek();
    }
}
