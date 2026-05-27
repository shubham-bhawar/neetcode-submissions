class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
    int loop = 0;
    public KthLargest(int k, int[] nums) {
        for(int x : nums) pq.offer(x);
        loop=k;
        
    }
    
    public int add(int val) {
        List<Integer> removed = new ArrayList<>();
        pq.offer(val);
        int sz = pq.size();
        int val1=0;
        int temp = loop;
        while(temp!=0){
            val1 = pq.poll();
            removed.add(val1);
            temp--;
        }
        for(int x : removed) pq.offer(x);
        return val1;
    }
}
