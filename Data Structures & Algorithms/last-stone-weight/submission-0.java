class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            minHeap.add(x);
        }

        while(! (minHeap.size()== 1 || minHeap.size()==0)){
            int x = minHeap.poll();
            int y = minHeap.poll();
            // System.out.println(x+" **** "+ y);
            if(x<y){
                minHeap.add(y-x);
            }else if(x>y){
                minHeap.add(x-y);
            }
        }

        return minHeap.isEmpty() ? 0 : minHeap.poll();
    }
}
