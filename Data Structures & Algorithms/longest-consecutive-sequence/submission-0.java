class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int x:nums) set.add(x);
       List<Integer> startElement = new ArrayList<>();
       for(int x:nums){
        if(!set.contains(x-1)) startElement.add(x);
       }
        int maxCount = 0;
       for(int x :startElement){
        int count=1;
        while(set.contains(x+1)){
            count++;
            x=x+1;
        }
        maxCount=Math.max(maxCount,count);
       }
       return maxCount;
    } 
}
